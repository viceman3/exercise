package example.framework

case class HttpRequest(method:String, url:String , params:Map[String,String])
case class HttpResponse(code: Int, body : String)

trait HttpRequestHandler {
  def handleRequest(httpRequest: HttpRequest) : HttpResponse
}

class HttpServer(handler: HttpRequestHandler) {
  def acceptRequest(httpRequest: HttpRequest) =handler.handleRequest(httpRequest)
  
}