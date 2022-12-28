package com.GatlingPerformanceFramework.simulation

import com.GatlingPerformanceFramework.config.Config.{rateEndRange, rateStartRange, users}
import com.GatlingPerformanceFramework.scenario.AddUserScenario
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class AddUserSimulationWith10ConstantUserPerSec extends Simulation{

  setUp(AddUserScenario.addUserScenario.inject(nothingFor(5), // will do nothing for 5 second
     atOnceUsers(users),// would add 10 users at once
     constantUsersPerSec(users) during (10 seconds), // Inject 10 users every second for next 10 sec
     rampUsersPerSec(rateStartRange) to (rateEndRange) during(20 seconds)))
}
