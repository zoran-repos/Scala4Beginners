@main def generateMultiplier(): Unit =
  def createMultiplier(factor: Double): Double => Double = (value: Double) => value * factor

  val triple = createMultiplier(3)
  println(triple(10.5))
