import scala.util.{Try, Success, Failure}

object RecoveryWithExample:
  private def divideWithRetry(a: Int, b: Int): Try[Int] =
    Try(a / b).recoverWith { case _: ArithmeticException => Try(a / 1) }

  def main(args: Array[String]): Unit =
    val result = divideWithRetry(10, 0)
    println(s"Result with retry mechanism: ${result.getOrElse(-1)}")
