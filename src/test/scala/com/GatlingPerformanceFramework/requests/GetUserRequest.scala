package com.GatlingPerformanceFramework.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.GatlingPerformanceFramework.config.Config.app_url

object GetUserRequest {
  var getUser=http("Get User")
    .get(app_url + "api/users/2")
    .check(status is 200)
    .check(jsonPath("$.data.id").is("2"))
    .check(jsonPath("$.data.first_name").is("Janet"))
}
