package example.entrypoint

import example.simulator._
import example.framework._
import example.app._

object EntryPoint {
  def main(args: Array[String]) ={
    println("Hello World!")
    val server =new HttpServer(new ExperimentalHandler)
    val simulator =new Simulator(server)
    simulator.simulate()
  }
}


