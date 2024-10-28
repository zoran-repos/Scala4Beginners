@main def transformStrings(): Unit =
  def applyTransformation(strings: List[String], transform: String => String): List[String] =
    strings.map(transform)

  val toUpperCase = (s: String) => s.toUpperCase
  val result = applyTransformation(List("apple", "banana", "cherry"), toUpperCase)
  println(result)
