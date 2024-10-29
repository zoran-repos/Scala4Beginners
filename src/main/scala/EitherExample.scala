import scala.util.{Try, Success, Failure}

object EitherExample:
  def parseToInt(value: String): Either[String, Int] =
    Try(value.toInt) match
      case Success(result) => Right(result)
      case Failure(_) => Left(s"Error: '$value' is not a valid number.")

  def main(args: Array[String]): Unit =
    val inputs = List("123", "abc", "456")
    inputs.foreach { input =>
      parseToInt(input) match
        case Right(value) => println(s"Parsed number: $value")
        case Left(error) => println(error)
    }