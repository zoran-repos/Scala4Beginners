@main def analyzeTemperatures(): Unit =
  val toCelsius = (f: Double) => (f - 32) * 5 / 9
  val temperaturesF = List(32.0, 50.0, 77.0)

  val temperaturesC = temperaturesF.map(toCelsius)
  println(temperaturesC)


//imperative way
/*
@main def analyzeTemperatures(): Unit = {
  def toCelsius(f: Double): Double = (f - 32) * 5 / 9
  val temperaturesF = List(32.0, 50.0, 77.0)
  var temperaturesC = List.empty[Double]

  for (tempF <- temperaturesF) {
    val tempC = toCelsius(tempF)
    temperaturesC = temperaturesC :+ tempC
  }

  println(temperaturesC)
}

*/