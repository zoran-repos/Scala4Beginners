@main def classifyNumbers(): Unit =
  val classify: PartialFunction[Int, String] = {
    case x if x > 0 => "positive"
    case x if x < 0 => "negative"
    case 0 => "zero"
  }

  val numbers = List(-5, 0, 3, -2, 8)
  val result = numbers.collect(classify)
  println(result)
