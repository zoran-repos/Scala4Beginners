@main def calculateDistance(): Unit =
  def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double =
    Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))

  println(distance(3.0, 4.0, 7.0, 1.0))  // Očekivani rezultat: 5.0
