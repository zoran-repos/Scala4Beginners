import scala.annotation.tailrec

@main def functionalControlStructuresExample(): Unit =
  val maxNumber = 10

  val parity = if maxNumber % 2 == 0 then "even" else "odd"
  println(s"$maxNumber is an $parity number.")

  // Functional for
  val sumForLoop = (1 to maxNumber).filter(_ % 2 == 0).sum
  println(s"Sum of even numbers from 1 to $maxNumber using for-comprehension: $sumForLoop")

  // Functional while loop (tail recursive)
  @tailrec
  def sumEvenRecursive(n: Int, accumulator: Int = 0): Int =
    if n > maxNumber then accumulator
    else sumEvenRecursive(n + 2, accumulator + n)

  val sumWhileLoop = sumEvenRecursive(2)
  println(s"Sum of even numbers from 1 to $maxNumber using recursive approach: $sumWhileLoop")

  val evenNumbers = for
    i <- 1 to maxNumber
    if i % 2 == 0
  yield i

  val sumOfEvenNumbers = evenNumbers.sum

  println(s"Even numbers from 1 to $maxNumber: $evenNumbers")
  println(s"Sum of even numbers from 1 to $maxNumber: $sumOfEvenNumbers")
