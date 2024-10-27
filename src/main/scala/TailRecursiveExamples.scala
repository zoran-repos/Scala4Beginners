import scala.annotation.tailrec

object TailRecursiveExamples:
  private def pureFactorial(n: Int): Int =
    @tailrec
    def factorialHelper(n: Int, accumulator: Int): Int =
      if n <= 1 then accumulator
      else factorialHelper(n - 1, n * accumulator)

    factorialHelper(n, 1)

  private def fibonacci(n: Int): Int =
    @tailrec
    def fibonacciHelper(n: Int, a: Int, b: Int): Int =
      if n == 0 then a
      else if n == 1 then b
      else fibonacciHelper(n - 1, b, a + b)

    fibonacciHelper(n, 0, 1)

  @main def runFactorial(): Unit =
    val number = 5
    println(s"The factorial of $number is: ${pureFactorial(number)}")
    println(s"The $number-th Fibonacci number is: ${fibonacci(number)}")
