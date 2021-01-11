package simulations

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import config.Data._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.BodyPart

import scala.concurrent.duration.DurationInt
import scala.util.Random

class XMLEndpointAPI extends Simulation {

  val now = LocalDate.now()
  val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd")

  //var header = ElFileBody("bodies/HeaderXMLMessage.xml")
  //var body = ElFileBody("bodies/BodyXMLMessage.xml")
  //var footer =  ElFileBody("bodies/FooterXMLMessage.xml")
  //var request = header+body+footer


    //val header = Source.fromFile("bodies/HeaderXMLMessage.xml").getLines

    //val body = Source.fromFile("bodies/BodyXMLMessage.xml").getLines

    //val footer = Source.fromFile("bodies/FooterXMLMessage.xml").getLines

    //Java Writer
    //val request = {
      //val fos = new java.io.FileOutputStream("request.xml")
      //new java.io.PrintWriter(fos, true)
    //}

    //val request = header ++ body ++ footer

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

    def hearing_Date(startDate:LocalDate): String =
      {
          startDate.minusDays(Random.nextInt(30)).format(pattern)
      }


    def userCount: Int = getProperty("Users", "1").toInt

    def rampDuration: Int = getProperty("Ramp_Duration", "10").toInt

    def testDuration: Int = getProperty("Test_Duration", "30").toInt

    before {
      println(s"Running tests with ${userCount} users.")
      println(s"Ramp duration is: ${rampDuration} seconds.")
      println(s"Test duration is: ${testDuration} seconds.")
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
               .bodyPart(ElFileBodyPart("bodies/HeaderXMLMessage.xml"))
              .bodyPart(ElFileBodyPart("bodies/BodyXMLMessage.xml"))
              .bodyPart(ElFileBodyPart("bodies/FooterXMLMessage.xml"))
              //.body(ElFileBody(request)
            //.body(ElFileBody("bodies/POSTXMLMessage.xml"))
            //.body(StringBody("bodies/POSTXMLMessage.xml"))

            //.post("/mirrorgateway/service/cpmgwextdocapi") //Enpoint for live

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

