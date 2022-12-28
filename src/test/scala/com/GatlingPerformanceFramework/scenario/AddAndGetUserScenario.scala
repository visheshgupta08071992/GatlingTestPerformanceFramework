package com.GatlingPerformanceFramework.scenario

import com.GatlingPerformanceFramework.requests.{AddUserRequest, GetUserRequest}
import io.gatling.core.Predef.scenario

object AddAndGetUserScenario {
  val addAndGetUserScenario = scenario("Add User and then get it Scenario")
    .exec(AddUserRequest.addUserThroughExternalFile)
    .exec(GetUserRequest.getUser)

}
