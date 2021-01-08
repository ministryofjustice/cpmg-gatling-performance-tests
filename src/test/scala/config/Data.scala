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

}
