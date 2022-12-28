package com.GatlingPerformanceFramework.config

object Config {
  val app_url = "https://reqres.in/"

  val users = Integer.getInteger("users", 10).toInt
  val rampUp = Integer.getInteger("rampup", 100).toInt
  val throughput = Integer.getInteger("throughput", 100).toInt
  val rateStartRange = Integer.getInteger("rateStartRange", 1).toInt
  val rateEndRange = Integer.getInteger("rateEndRange", 5).toInt
}