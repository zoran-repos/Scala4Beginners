@main def filterWords(): Unit =
  def containsKeyword(keyword: String): String => Boolean = text => text.contains(keyword)

  val containsScala = containsKeyword("Scala")
  val words = List("I love Scala", "Java is cool", "Scala is awesome")
  println(words.filter(containsScala))