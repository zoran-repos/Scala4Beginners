@main def calculateEnergy(): Unit =
  inline def kineticEnergy(mass: Double, velocity: Double): Double = 0.5 * mass * Math.pow(velocity, 2)

  val energy = kineticEnergy(50, 10)
  println(s"Kinetic energy: $energy J")
