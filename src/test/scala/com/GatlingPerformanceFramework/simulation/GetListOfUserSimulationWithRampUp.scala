package com.GatlingPerformanceFramework.simulation

import com.GatlingPerformanceFramework.config.Config.{rampUp, rateEndRange, rateStartRange, users}
import com.GatlingPerformanceFramework.scenario.{AddUserScenario, GetListOfUserScenario}
import io.gatling.core.Predef.{Simulation, _}

import scala.concurrent.duration._
import scala.language.postfixOps

class GetListOfUserSimulationWithRampUp extends Simulation{

  setUp(GetListOfUserScenario.getListOfusers.inject(nothingFor(5), // will do nothing for 5 second
     atOnceUsers(users),// would add 10 users at once
     rampUsers(rampUp) during(10 seconds)))
}
