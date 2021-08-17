package simulations

import java.io.{FileOutputStream, PrintWriter}
import java.time.{LocalDate, LocalDateTime}
import java.time.format.DateTimeFormatter
import java.util.UUID.randomUUID

import config.Data.{csvCourtInfo, _}
import config.XMLMessageString._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration.DurationInt
import scala.util.Random

class XMLEndpointAPI extends Simulation {

  //Create an output to help monitoring of devs.
  val createOutputVariables = {
    val fos = new java.io.FileOutputStream("createOutputVariables.csv")
    new java.io.PrintWriter(fos, true)
  }

  //Create the output for cases of 100 in an XML.
  val createCaseOutput = {
    val fos = new FileOutputStream("100cases.xml")
    new PrintWriter(fos, true)
  }

    val createCaseNumberCsv = {
      val fos = new java.io.FileOutputStream("src/test/resources/data/caseNumber.csv")
      new java.io.PrintWriter(fos, true)
    }

    val createCaseNo = {
      createCaseNumberCsv.print("caseNo\n")
      for (i <- 1 until 10000) {
        createCaseNumberCsv.println(generateRandomNumber())
      }
    }

  //Specify for time for hearing date.
  val now = LocalDate.now()
  val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd")

  //Number of courts.
  def numberOfCourts: Int = getProperty("Number_Of_Courts", "1").toInt

  //Specifying bodies method.
  def buildCpmgBody() = {

    var totalBodies = ""

    for (i <- 1 until numberOfCourts + 1) {
      totalBodies += cmpgBody
    }
    totalBodies
  }

  //For when we string together a whole message with specified bodies.
  def testXml = {
    cmpgHeader + buildCpmgBody() + cmpgFooter
  }

  val sentHeaders = Map("Content-Type" -> "application/soap+xml")
  val httpProtocol = http
    .baseUrl("https://"+env+".crime-portal-mirror-gateway.service.justice.gov.uk")
    .headers(sentHeaders)

  //Using default and specified values for cmd line args.
  private def getProperty(propertyName: String, defaultValue: String): String = {
    {
      {
        Option(System.getenv(propertyName))
          .orElse(Option(System.getProperty(propertyName)))
          .getOrElse(defaultValue)
      }
    }

    //Date for message.
  }

  def local_nowDate(): String = {
    {
      DateTimeFormatter.ofPattern("dd/MM/YYYY").format(now)
    }
  }


  //For the sourcefilename to be unique.
  def source_fileDate(): String = {
    {
      DateTimeFormatter.ofPattern("ddMMYYYY").format(now)
    }
  }

  //For generating date with time.
  def local_nowTime():String = {

    LocalDateTime.now.format(DateTimeFormatter.ofPattern("YYYYMMdd_HHmmss"))
  }

  // Generate code for CaseNo.
  def generateRandomNumber() = {
    val rangeMin = 1000000000000L
    val rangeMax = 9999999999999L

    val r = new Random()
    val randomValue = rangeMin + ((rangeMax - rangeMin) * r.nextDouble())
    randomValue.toLong
  }

  //Court room number to take one digit to append to 0 to make '0X'
  def courtRoomNumber(): Int = {
    {
      val r = new Random()
      r.nextInt(9)

    }

  }

  //Date of hearing.
  def hearing_Date(startDate:LocalDate): String = {
    {
      startDate.minusDays(Random.nextInt(30)).format(pattern)
    }
  }

  //Set user as (message count) in this case set to 1.
  def userCount: Int = getProperty("Users", "2").toInt

  //def rampDuration: Int = getProperty("Ramp_Duration", "10").toInt
  def env: String = getProperty("Env","preprod")

  //Run once through set duration to 0.
  def testDuration: Int = getProperty("Duration", "0").toInt

  //Run with 'offenderData' if stored live data is visible in mined-data directory
  // Otherwise run with 'normalData' which is available in mined-data.
  def dataUsed: String = getProperty("Data","normalData")
  //If statement to pick the given stated databank from cmd line to be used in the test.
    val csvDefendantMatch =
  if (dataUsed == "offenderData") {
    csv("mined-data/defendantMatch.csv").random
  }
  else  {
    csv("mined-data/defendantMatch_Dummy.csv").random
  }

  //Number of bodies from document -> document.
  def numberOfMessages: Int = getProperty("Number_of_messages", "1").toInt

  createOutputVariables.println("CaseNo,CourtCode,CourtRoomNumber,LocalTime")

  before {
    println(s"Running tests with ${userCount} users.")
    println(s"Test duration is: ${testDuration} minutes.")
    println(s"The enviroment that is being tested against is: ${env}.")
    println(s"Number of messages used in test are: ${numberOfMessages}.")
    println(s"The test is running with ${dataUsed}.")
  }

  val scn = scenario("Libra Batch Process API") // A scenario for the LIBRA Batch Process.
    .exec(session => session.set("local_nowDate", local_nowDate()))
    .exec(session => session.set("local_nowTime", local_nowTime()))
    .exec(session => session.set("source_fileDate", source_fileDate()))
    .exec(session => session.set("caseNo",generateRandomNumber()))
    .exec(session => session.set("courtRoomNumber",courtRoomNumber()))
    .exec(session => session.set("messageId", randomUUID()))
    .feed(csvCourtInfo)
    .feed(csvDOBDay,100)
    .feed(csvDOBMonth,100)
    .feed(csvDOBYear,100)
    .feed(csvFirstName,100)
    .feed(csvSurname,100)
    .feed(csvCaseNumber, 100)
    .feed(csvDefendantMatch,100)
    //Use below if live data not available to user testing.
    //.feed(csvDefendantMatchMock,100)
    .exec(http("crime-portal-gateway POST")
      .post("/mirrorgateway/service/cpmgwextdocapi") //Enpoint for live
//      .post("/crime-portal-gateway/ws") // Enpoint of mock version.
      .body(ElFileBody("bodies/50CaseXMLMessage.xml")).asXml
      .requestTimeout(3.minutes)
      .check(status.is(200))
      .check(status.not(404), status.not(500)))
    .pause(3)
    .exec(session => {
      for (i <- 1 to 50 ) {
        createOutputVariables.println(session("caseNo"+i).as[String],session("court_code").as[String]
          ,"0" + session("courtRoomNumber").as[String],session("local_nowTime").as[String])
      }
      session
    })

  setUp(

    scn.inject
    (nothingFor(5 seconds),
      //atOnceUsers(userCount)
      rampUsers(userCount).during(testDuration.minutes)
    )

  )
    .protocols(httpProtocol)

}

