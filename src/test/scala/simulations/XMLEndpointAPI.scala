package simulations

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import config.Data.{csvCourtInfo, _}
import config.XMLMessageString._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration.DurationInt
import scala.util.Random

class XMLEndpointAPI extends Simulation {

  val createOutputVariables = {
    val fos = new java.io.FileOutputStream("src/test/resources/data/createOutputVariables.csv")
    new java.io.PrintWriter(fos, true)
  }

  //    createCaseNumberCsv.println("caseNo")
  //  for (i <- 1 until 100000 ) {
  //    createCaseNumberCsv.println(generateRandomNumber())
  ////    createCaseNumberCsv.println(court)
  //  }

  val now = LocalDate.now()
  val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd")

  def numberOfCourts: Int = getProperty("Number_Of_Courts", "1").toInt

  def testXml = {
    cmpgHeader + cmpgBody + cmpgFooter
  }

  val httpProtocol = http
    .baseUrl("https://crime-portal-gateway-dev.apps.live-1.cloud-platform.service.justice.gov.uk") // Here is the BaseURL which is mock version.
    //.baseUrl("https://dev.crime-portal-mirror-gateway.service.justice.gov.uk") // Here is the BaseURL for our live test,we will send our XML to this.
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")


  private def getProperty(propertyName: String, defaultValue: String): String =
  {
    {
      Option(System.getenv(propertyName))
        .orElse(Option(System.getProperty(propertyName)))
        .getOrElse(defaultValue)
    }
  }

  def local_nowDate(): String =
  {
    DateTimeFormatter.ofPattern("dd/MM/YYYY").format(now)
  }

  // Generate code for CaseNo.
  def generateRandomNumber() = {
    val rangeMin = 1000000000000L
    val rangeMax = 9999999999999L

    val r = new Random()
    val randomValue = rangeMin + ((rangeMax - rangeMin) * r.nextDouble())

    randomValue.toLong
  }

  def hearing_Date(startDate:LocalDate): String = {
    startDate.minusDays(Random.nextInt(30)).format(pattern)
  }

  //Set user as (message count) in this case set to 1.
  def userCount: Int = getProperty("Users", "1").toInt

  //Run once through set duration to 0.
  def testDuration: Int = getProperty("Test_Duration", "0").toInt

  def numberOfMessages: Int = getProperty("Number_of_messages", "1").toInt

  before {
    println(s"Running tests with ${userCount} users.")
    println(s"Test duration is: ${testDuration} seconds.")
    println(s"Number of messages used in test are: ${numberOfMessages}.")
  }

  val scn = scenario("Libra Batch Process API") // A scenario for the LIBRA Batch Process.
    //        feed(csvFeeder)
    .exec(session => session.set("local_nowDate", local_nowDate()))
    .exec(session => session.set("caseNo",generateRandomNumber()))
    //exec(session => session.set("body", body))
    //exec(session => session.set("hearing_Date", hearing_Date(local_nowDate())))
    .feed(csvCourtInfo)
    .feed(csvDOBDay,22)
    .feed(csvDOBMonth,12)
    .feed(csvDOBYear,22)
    .feed(csvFirstName,22)
    .feed(csvSurname,22)
    .feed(csvCaseNumber, 22)
    .feed(csvDefendantMatch,17)
    .exec(http("cpmAPI enpoint")
      .post("/crime-portal-gateway/ws") // Enpoint of mock version.
      .body(StringBody(testXml))
      .requestTimeout(3.minutes)
      //.post("/mirrorgateway/service/cpmgwextdocapi") //Enpoint for live

      .check(status.is(200))
      .check(status.not(404), status.not(500)))
    .pause(3)
    .exec(session => {
      for (i <- 1 until 23 ) {
        //createCaseNumberCsv.println(session("court_name").as[String] + ", " + session("caseNo"+i).as[String])
        createOutputVariables.println(session("caseNo"+i).as[String],session("court_code").as[String])
      }
      session
    })

  setUp(

    scn.inject
    (nothingFor(5 seconds),
      atOnceUsers(userCount)
    )
  )
    .protocols(httpProtocol)

  //setUp(
  //scn.inject(atOnceUsers(1))
  //).protocols(httpProtocol)

}

