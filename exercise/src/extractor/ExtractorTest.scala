package extractor

object ExtractorTest {
  def main(args: Array[String]) ={
    val number: Int = -1
    val ret =number match {
      case number if number >0 => 1
      case number if number <0 => -1
      case number if number ==0 => 0
    }
    println(ret)

  }
  
}