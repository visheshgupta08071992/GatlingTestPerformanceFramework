package com.GatlingPerformanceFramework.requests

import com.GatlingPerformanceFramework.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetListOfUserRequest {
  var getListOfUsers=http("Get User")
    .get(app_url + "api/users?page=2")
    .check(status is 200)
    .check(jsonPath("$.data[0].id").is("7"))
    .check(jsonPath("$.data[0].first_name").is("Michael"))
}
