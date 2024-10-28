@main def runMatrixExample(): Unit = {

  val matrix: Array[Array[Int]] = Array(
    Array(1, 2, 3),
    Array(4, 5, 6),
    Array(7, 8, 9)
  )
  val matrix2: List[List[Int]] = List(
    List(1, 2, 3),
    List(4, 5, 6),
    List(7, 8, 9)
  )
  
  val updatedMatrix2: List[List[Int]] = matrix2.updated(0, matrix2(0).updated(0, matrix2(0)(0) + 10))

  val matrixSum2 = updatedMatrix2.flatten.reduce(_ + _)

  matrix(0)(0) = 10

  val matrixSum = matrix.flatten.reduce(_ + _)
  println(s"Updated Matrix Sum: $matrixSum")
  println(s"Updated Matrix2 Sum: $matrixSum2")
}