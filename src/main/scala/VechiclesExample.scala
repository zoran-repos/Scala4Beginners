
// Apstraktna klasa Vehicle sa zajedničkim karakteristikama za sva vozila
abstract class Vehicle(val brand: String):
  def move(): String
  def description(): String = s"This is a $brand vehicle."

// Trait Electric dodaje ponašanje punjenja
trait Electric:
  def charge(): String = "Charging the battery"

// Trait FourWheeler dodaje broj točkova za vozila sa četiri točka
trait FourWheeler:
  def wheels: Int = 4

// Klasa ElectricCar koja nasleđuje Vehicle i mixuje Electric i FourWheeler
class ElectricCar(brand: String) extends Vehicle(brand) with Electric with FourWheeler:
  def move(): String = "Driving quietly on electric power"

// Main metod za testiranje
@main def runVehicleExample(): Unit =
  val tesla = new ElectricCar("Tesla")
  println(tesla.description())          // "This is a Tesla vehicle."
  println(tesla.move())                 // "Driving quietly on electric power"
  println(tesla.charge())               // "Charging the battery"
  println(s"Number of wheels: ${tesla.wheels}") // "Number of wheels: 4"