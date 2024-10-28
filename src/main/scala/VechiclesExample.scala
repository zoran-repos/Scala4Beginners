abstract class Vehicle(val brand: String):
  def move(): String
  def description(): String = s"This is a $brand vehicle."

trait Electric:
  def charge(): String = "Charging the battery"

trait FourWheeler:
  def wheels: Int = 4

class ElectricCar(brand: String) extends Vehicle(brand) with Electric with FourWheeler:
  def move(): String = "Driving quietly on electric power"

@main def runVehicleExample(): Unit =
  val tesla = new ElectricCar("Tesla")
  println(tesla.description())
  println(tesla.move())
  println(tesla.charge())
  println(s"Number of wheels: ${tesla.wheels}")