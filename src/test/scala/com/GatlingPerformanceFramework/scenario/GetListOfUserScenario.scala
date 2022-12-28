package com.GatlingPerformanceFramework.scenario

import com.GatlingPerformanceFramework.requests.{AddUserRequest, GetListOfUserRequest, GetUserRequest}
import io.gatling.core.Predef.scenario

object GetListOfUserScenario {
  val getListOfusers = scenario("Get List of User Scenario")
    .exec(GetListOfUserRequest.getListOfUsers)

}
