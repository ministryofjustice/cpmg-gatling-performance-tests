package simulations

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import config.Data._
import config.XMLMessageString._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration.DurationInt
import scala.util.Random

class XMLEndpointAPI extends Simulation {

  val now = LocalDate.now()
  val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd")

  //def cmpgHeader = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\"\n               xmlns:ns35=\"http://www.justice.gov.uk/magistrates/external/ExternalDocumentRequest\">\n    <soap:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">\n        <wsa:Action>externalDocument</wsa:Action>\n        <wsa:From>\n            <wsa:Address>CP_NPS_ML</wsa:Address>\n        </wsa:From>\n        <wsa:MessageID>09233523-345b-4351-b623-5dsf35sgs5d6</wsa:MessageID>\n        <wsa:RelatesTo>RelatesToValue</wsa:RelatesTo>\n        <wsa:To>CP_NPS</wsa:To>\n    </soap:Header>\n    <soap:Body>\n        <ns35:ExternalDocumentRequest>\n"
  //def cmpgBody = "<documents>\n            <document>\n                <info>\n                    <general>\n                        <doc_type>EDT_Adult_Daily_Courtlist</doc_type>\n                        <outputtype>R</outputtype>\n                        <version>1_0</version>\n                        <docref>575</docref>\n                        <system>L</system>\n                    </general>\n                    <source_file_name>5_26102020_2992_${court_code}00_ADULT_COURT_LIST_DAILY</source_file_name>\n                    <printers/>\n                    <parameters>\n                        <pi_mcc_id>7</pi_mcc_id>\n                        <pi_psa_code>2360</pi_psa_code>\n                        <pi_job_type>ADULT_COURT_LIST_DAILY</pi_job_type>\n                        <pi_run_date>26/11/2020</pi_run_date>\n                        <pi_edt_user>2368</pi_edt_user>\n                    </parameters>\n                    <start_time>09:05:04</start_time>\n                </info>\n                <data>\n                    <job>\n                        <printdate>${local_nowDate}</printdate>\n                        <username>gl.userone</username>\n                        <late>N</late>\n                        <adbox>N</adbox>\n                        <means>N</means>\n                        <sessions>\n                            <session>\n                                <s_id>556805</s_id>\n                                <doh>${local_nowDate}</doh>\n                                <lja>${court_name}; Court</lja>\n                                <cmu>Gl Management Unit 1</cmu>\n                                <panel>Adult Panel</panel>\n                                <court>${court_name}</court>\n                                <room>00</room>\n                                <sstart>09:00</sstart>\n                                <send>12:00</send>\n                                <blocks>\n                                    <block>\n                                        <sb_id>758095</sb_id>\n                                        <bstart>09:00</bstart>\n                                        <bend>12:00</bend>\n                                        <desc>First Hearings Slot</desc>\n                                        <cases>\n                                            <case>\n                                                <c_id>1218461</c_id>\n                                                <h_id>1294273</h_id>\n                                                <valid>Y</valid>\n                                                <!-- Less than 10 digits would fail schema validation, if we did it -->\n                                                <caseno>166662981</caseno>\n                                                <type>C</type>\n                                                <def_name>MR ${firstName} ${surname}</def_name>\n                                                <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>\n                                                <def_type>P</def_type>\n                                                <def_sex>M</def_sex>\n                                                <def_name_elements>\n                                                    <title>Mr</title>\n                                                    <forename1>${firstName}</forename1>\n                                                    <forename2/>\n                                                    <forename3/>\n                                                    <surname>${surname}</surname>\n                                                </def_name_elements>\n                                                <pnc_id>2020/1276541A</pnc_id>\n                                                <cro_number>CR0006100061</cro_number>\n                                                <def_addr>\n                                                    <line1>A1</line1>\n                                                </def_addr>\n                                                <inf>POL01</inf>\n                                                <cseq>2</cseq>\n                                                <listno>1st</listno>\n                                                <offences>\n                                                    <offence>\n                                                        <oseq>1</oseq>\n                                                        <co_id>1185408</co_id>\n                                                        <code>TH68010</code>\n                                                        <maxpen>EW: 6M ;/or Ultd Fine</maxpen>\n                                                        <title>Theft from a shop</title>\n                                                        <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>\n                                                        <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>\n                                                    </offence>\n                                                </offences>\n                                            </case>\n                                        </cases>\n                                    </block>\n                                </blocks>\n                            </session>\n                        </sessions>\n                    </job>\n                </data>\n            </document>\n        </documents>\n"
  //def cmpgFooter = "</ns35:ExternalDocumentRequest>\n        </soap:Body>\n        </soap:Envelope>"

  def numberOfCourts: Int = getProperty("Number_Of_Courts", "5").toInt

  def buildCpmgBody() = {

    var totalBodies = ""

    for (i <- 1 until numberOfCourts + 1) {
      totalBodies += cmpgBody
    }
    totalBodies
  }

  def testXml = {
    cmpgHeader + buildCpmgBody() + cmpgFooter
  }

  val httpProtocol = http
    .baseUrl("https://crime-portal-gateway-dev.apps.live-1.cloud-platform.service.justice.gov.uk") // Here is the BaseURL which is mock version.
    //.baseUrl("https://dev.crime-portal-mirror-gateway.service.justice.gov.uk") // Here is the BaseURL for our live test,we will send our XML to this.
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
  //.header("Content-Type", "application/xml")


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

  def hearing_Date(startDate:LocalDate): String =
  {
    startDate.minusDays(Random.nextInt(30)).format(pattern)
  }


  def userCount: Int = getProperty("Users", "1").toInt

  def rampDuration: Int = getProperty("Ramp_Duration", "10").toInt

  def testDuration: Int = getProperty("Test_Duration", "30").toInt

  def numberOfMessages: Int = getProperty("Number_of_messages", "1").toInt

  before {
    println(s"Running tests with ${userCount} users.")
    println(s"Ramp duration is: ${rampDuration} seconds.")
    println(s"Test duration is: ${testDuration} seconds.")
    println(s"Number of messages used in test are: ${numberOfMessages}.")
  }

  val scn = scenario("Libra Batch Process API") // A scenario for the LIBRA Batch Process.
    .forever() {
      //        feed(csvFeeder)
      exec(session => session.set("local_nowDate", local_nowDate()))
        //exec(session => session.set("body", body))
        //exec(session => session.set("hearing_Date", hearing_Date(local_nowDate())))
        .feed(csvCourtInfo)
        .feed(csvDOBDay)
        .feed(csvDOBMonth)
        .feed(csvDOBYear)
        .feed(csvFirstName)
        .feed(csvSurname)
        .exec(http("cpmAPI enpoint")
          .post("/crime-portal-gateway/ws") // Enpoint of mock version.
          //.post("/mirrorgateway/service/cpmgwextdocapi") //Enpoint for live
          .body(StringBody(testXml))
          .check(status.is(200))
          .check(status.not(404), status.not(500))
        )
        .pause(3)
    }

  setUp(
    scn.inject
    (nothingFor(5 seconds),
      rampUsers(userCount)
        during (rampDuration))
  )
    .protocols(httpProtocol).maxDuration(testDuration)
}

