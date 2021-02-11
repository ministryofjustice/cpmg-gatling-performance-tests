package config

import io.gatling.core.Predef.{configuration, csv}

object Data {

  // Randomized/generic data:
  val csvCourtInfo = csv("data/court_202012141528.csv").random
  val csvFirstName = csv("data/firstNames.csv").random
  val csvSurname = csv("data/surnames.csv").random
  val csvDOBDay = csv("data/dobDay.csv").random
  val csvDOBMonth = csv("data/dobMonth.csv").random
  val csvDOBYear = csv("data/dobYear.csv").random
  val csvCaseNumber = csv("data/caseNumber.csv").random
  val csvDefendantMatch = csv("mined-data/defendantMatch.csv").random

  //If Live Data not available to you then use below (uncomment - this data contains dummy information
  // just to ensure tests dont fail, it will not trigger any Court Case Matches)

  //val csvDefendantMatchMock = csv("data/defendantMatch_Mock.csv").random
}
