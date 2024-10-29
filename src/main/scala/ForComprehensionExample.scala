import scala.util.{Try, Success, Failure}

object ForComprehensionExample:
  def divide(a: Int, b: Int): Try[Int] = Try(a / b)
  private def addTen(value: Int): Try[Int] = Try(value + 10)
  private def subtractFive(value: Int): Try[Int] = Try(value - 5)

  def main(args: Array[String]): Unit =
    val result = for
      res1 <- divide(20, 5)
      res2 <- addTen(res1)
      res3 <- subtractFive(res2)
    yield res3

    result match
      case Success(value) => println(s"Final result after chaining: $value")
      case Failure(exception) => println(s"Error in one of the operations: ${exception.getMessage}")
