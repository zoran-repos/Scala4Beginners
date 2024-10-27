trait Vehicle:
  def brand: String
  def model: String
  def details: String

trait Movable:
  def move(): String = "Moving forward"
  def stop(): String = "Stopped"

case class Car(brand: String, model: String, fuelType: String) extends Vehicle with Movable:
  def details: String = s"$brand $model running on $fuelType"

case class Bicycle(brand: String, model: String, gearCount: Int) extends Vehicle with Movable:
  def details: String = s"$brand $model with $gearCount gears"

def describeVehicle(vehicle: Vehicle & Movable): String =
  s"${vehicle.details}, Status: ${vehicle.move()}"

@main def runVehicleExample(): Unit =
  val car = Car("Toyota", "Corolla", "Gasoline")
  val bicycle = Bicycle("Giant", "Escape 3", 21)
  println(describeVehicle(car))
  println(describeVehicle(bicycle))