import scala.util.{Try, Success, Failure}

object TryOptionExample:
  private def parseToInt(value: Option[String]): Try[Int] =
    value match
      case Some(v) => Try(v.toInt)
      case None => Failure(new NoSuchElementException("Value is missing"))

  def main(args: Array[String]): Unit =
    val result1 = parseToInt(Some("123"))
    val result2 = parseToInt(None)

    println(s"Result 1: ${result1.getOrElse("Failure")}")
    println(s"Result 2: ${result2.getOrElse("Failure")}")
