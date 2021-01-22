package simulations

import java.io.{FileOutputStream, PrintWriter}
import java.time.{LocalDate, LocalDateTime}
import java.time.format.DateTimeFormatter

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

//  for(i <- 1 until 100)
//    createCaseOutput.println("<case>\n                                                    <c_id>1218461</c_id>\n                                                    <h_id>1294273</h_id>\n                                                    <valid>Y</valid>\n                                                    <!-- Less than 10 digits would fail schema validation, if we did it -->\n                                                    <caseno>${caseNo" + i +"}</caseno>\n                                                    <type>C</type>\n                                                    <def_name>MR ${Matched_FirstName" + i +"} ${Matched_Surname"+ i +"}</def_name>\n                                                    <def_dob>${Matched_dobDay"+ i +"}/${Matched_dobMonth"+ i +"}/${Matched_dobYear"+ i +"}</def_dob>\n                                                    <def_type>P</def_type>\n                                                    <def_sex>M</def_sex>\n                                                    <def_name_elements>\n                                                        <title>Mr</title>\n                                                        <forename1>${Matched_FirstName"+ i +"}</forename1>\n                                                        <forename2/>\n                                                        <forename3/>\n                                                        <surname>${Matched_Surname"+ i +"}</surname>\n                                                    </def_name_elements>\n                                                    <pnc_id>${Matched_PNC"+ i +"}</pnc_id>\n                                                    <cro_number>CR0006100061</cro_number>\n                                                    <def_addr>\n                                                        <line1>A1</line1>\n                                                    </def_addr>\n                                                    <inf>POL01</inf>\n                                                    <cseq>2</cseq>\n                                                    <listno>1st</listno>\n                                                    <offences>\n                                                        <offence>\n                                                            <oseq>1</oseq>\n                                                            <co_id>1185408</co_id>\n                                                            <code>TH68010</code>\n                                                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>\n                                                            <title>Theft from a shop</title>\n                                                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>\n                                                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>\n                                                        </offence>\n                                                    </offences>\n                                                </case>")
  //    createCaseNumberCsv.println("caseNo")
  //  for (i <- 1 until 100000 ) {
  //    createCaseNumberCsv.println(generateRandomNumber())
  ////    createCaseNumberCsv.println(court)
  //  }

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

  //Headers for POST message.
  val httpProtocol = http
    .baseUrl("https://crime-portal-gateway-dev.apps.live-1.cloud-platform.service.justice.gov.uk") // Here is the BaseURL which is mock version.
    //.baseUrl("https://dev.crime-portal-mirror-gateway.service.justice.gov.uk") // Here is the BaseURL for our live test,we will send our XML to this.
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")


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
    val roomMin = 0
    val roomMax = 9

    val r = new Random()
    val randomValue = roomMin + ((roomMin - roomMax) * r.nextInt())
    randomValue.toInt
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

  //Run once through set duration to 0.
  def testDuration: Int = getProperty("Test_Duration", "0").toInt

  //Number of bodies from document -> document.
  def numberOfMessages: Int = getProperty("Number_of_messages", "1").toInt

  before {
    println(s"Running tests with ${userCount} users.")
    //println(s"Ramp duration is: ${rampDuration} seconds.")
    println(s"Test duration is: ${testDuration} seconds.")
    println(s"Number of messages used in test are: ${numberOfMessages}.")
  }

  val scn = scenario("Libra Batch Process API") // A scenario for the LIBRA Batch Process.
    //        feed(csvFeeder)
    .exec(session => session.set("local_nowDate", local_nowDate()))
    .exec(session => session.set("local_nowTime", local_nowTime()))
    .exec(session => session.set("source_fileDate", source_fileDate()))
    .exec(session => session.set("caseNo",generateRandomNumber()))
    .exec(session => session.set("courtRoomNumber",courtRoomNumber()))
    .feed(csvCourtInfo)
    .feed(csvDOBDay,100)
    .feed(csvDOBMonth,100)
    .feed(csvDOBYear,100)
    .feed(csvFirstName,100)
    .feed(csvSurname,100)
    .feed(csvCaseNumber, 100)
    .feed(csvDefendantMatch,100)
    .exec(http("cpmAPI enpoint")
      .post("/crime-portal-gateway/ws") // Enpoint of mock version.
//      .body(ElFileBody("/home/tools/data/src/test/resources/bodies/25CaseXMLMessage.xml")).asXml
      .body(ElFileBody("/home/tools/data/src/test/resources/bodies/100CaseXMLMessage.xml"))
      //.body(StringBody(testXml))
      .requestTimeout(3.minutes)
      //.post("/mirrorgateway/service/cpmgwextdocapi") //Enpoint for live
      .check(status.is(200))
      .check(status.not(404), status.not(500)))
    .pause(3)
    .exec(session => {
      for (i <- 1 until 25 ) {
        //createCaseNumberCsv.println(session("court_name").as[String] + ", " + session("caseNo"+i).as[String])
        createOutputVariables.println(session("caseNo"+i).as[String],session("court_code").as[String]
          ,session("courtRoomNumber").as[String],session("local_nowTime").as[String])
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

