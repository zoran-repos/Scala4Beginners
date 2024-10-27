@main def forLoopExamples(): Unit =
  val maxNumber = 10

  println("Simple for loop:")
  for i <- 1 to maxNumber do
    println(s"Number: $i")

  println("\nFor loop with condition (only even numbers):")
  for i <- 1 to maxNumber if i % 2 == 0 do
    println(s"Even number: $i")

  println("\nNested for loop (pairs where i < j):")
  for
    i <- 1 to maxNumber
    j <- i + 1 to maxNumber
  do
    println(s"Pair: ($i, $j)")

  println("\nFor comprehension with yield (squares of even numbers):")
  val squaresOfEvenNumbers = for
    i <- 1 to maxNumber
    if i % 2 == 0
  yield i * i

  println(s"Squares of even numbers from 1 to $maxNumber: $squaresOfEvenNumbers")
