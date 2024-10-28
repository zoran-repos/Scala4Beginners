
val numbers: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


val evenNumbers: Array[Int] = numbers.filter(_ % 2 == 0)
val squaredNumbers: Array[Int] = numbers.map(n => n * n)
val sumOfNumbers: Int = numbers.reduce((a, b) => a + b)
@main def runArrayExamples(): Unit = {

  println(s"Even Numbers: ${evenNumbers.mkString(", ")}")
  println(s"Squared Numbers: ${squaredNumbers.mkString(", ")}")
  println(s"Sum of Numbers: $sumOfNumbers")
}