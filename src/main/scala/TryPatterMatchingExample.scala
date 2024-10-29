import scala.util.{Try, Success, Failure}

object TryPatterMatchingExample:
  private def divide(a: Int, b: Int): Try[Int] = Try(a / b)

  def main(args: Array[String]): Unit = {
    val result = divide(10, 0)
    result match {
      case Success(value) => println(s"Result: $value")
      case Failure(e: ArithmeticException) => println("Error: Division by zero is not allowed.")
      case Failure(exception) => println(s"Unknown error: ${exception.getMessage}")
    }
  }