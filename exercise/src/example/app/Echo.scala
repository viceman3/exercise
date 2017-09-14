package example.app

import example.framework._

class ExperimentalHandler extends HttpRequestHandler {
  override def handleRequest(req: HttpRequest) : HttpResponse ={

    println(s"incoming httprequest: ${req}")
???
    /*
    req.url match {
      case "/api/echo" => HttpResponse(req.params.get("text").getOrElse("text not found"))
      case "/api/reverse" => 
      
    }
*/  
   }


}

