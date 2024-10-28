@main def runFactorialAndGrouping(): Unit = {
  val numbersToFactorial = Array(1, 2, 3, 4, 5)
  val factorials = numbersToFactorial.map(n => (1 to n).foldLeft(1)(_ * _))
  println(s"Factorials: ${factorials.mkString(", ")}")

  val numbers = Array(1, 2, 3, 4, 5)

  val (even, odd) = numbers.partition(_ % 2 == 0)
  println(s"Numbers: ${numbers.mkString(", ")}")
  println(s"Even: ${even.mkString(", ")}")
  println(s"Odd: ${odd.mkString(", ")}")

  val groupedByParity = numbers.groupBy(_ % 2 == 0)
  println(s"Grouped By Parity: $groupedByParity")
  println(s"Even Numbers: ${groupedByParity(true).mkString(", ")}")
  println(s"Odd Numbers: ${groupedByParity(false).mkString(", ")}")
}