package example.simulator

import example.framework._

class Simulator(server: HttpServer) {
  def simulate() ={
    val req1: HttpRequest =HttpRequest("get", "/api/echo", Map("text" -> "wellcome"))
    println(s"httprequest: ${req1}")
    val resp1: HttpResponse =server.acceptRequest(req1)
    println(s"response: ${resp1}")
    val req2: HttpRequest =HttpRequest("get", "/api/reverse", Map("text" -> "wellcome"))
    println(s"httprequest: ${req2}")
    val resp2: HttpResponse =server.acceptRequest(req2)
    println(s"response: ${resp2}")

  }

}

