package com.GatlingPerformanceFramework.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.GatlingPerformanceFramework.config.Config.app_url
import com.GatlingPerformanceFramework.util.RandomString.randomString

object AddUserRequest {
  var addUserThroughExternalFile=http("Add User Request")
    .post(app_url + "api/users")
    .body(RawFileBody("./src/test/resources/bodies/AddUser.json"))
    .asJson
    .check(status is 201)

  var addUserWithDynamicData=http("Add User Request")
    .post(app_url + "/api/users")
    .body(StringBody(s"{\n  \"name\": \"${randomString(6)}\",\n  \"job\": \"leader\"\n}")) //dynamic value of length as 6 would sent as name using created random string function
    .asJson
    .check(status is 201)

}
