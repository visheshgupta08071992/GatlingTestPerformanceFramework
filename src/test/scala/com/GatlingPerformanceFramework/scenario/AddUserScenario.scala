package com.GatlingPerformanceFramework.scenario
import com.GatlingPerformanceFramework.requests.AddUserRequest
import io.gatling.core.Predef.scenario

object AddUserScenario {
  val addUserScenario = scenario("Add User Scenario")
    .exec(AddUserRequest.addUserWithDynamicData)

}
