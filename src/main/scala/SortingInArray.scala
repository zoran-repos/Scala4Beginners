@main def runSortingInArray(): Unit = {
  val randomNumbers = Array(5, 2, 9, 1, 6, 3, 7, 4, 8)


  val sortedNumbers = randomNumbers.sorted
  println(s"Sorted Numbers: ${sortedNumbers.mkString(", ")}")

  val ascendingNumbers = randomNumbers.sortWith(_ < _)
  println(s"Ascending Order: ${ascendingNumbers.mkString(", ")}")
  ascendingNumbers.foreach(print)

  println

  val descendingNumbers = randomNumbers.sortWith(_ > _)
  println(s"Descending Order: ${descendingNumbers.mkString(", ")}")


  val reversedNumbers = randomNumbers.reverse
  println(s"Reversed Numbers: ${reversedNumbers.mkString(", ")}")
}