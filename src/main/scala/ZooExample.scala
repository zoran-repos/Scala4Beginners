trait Animal:
  def name: String
  def sound: String

trait Mammal extends Animal:
  def isWarmBlooded: Boolean = true

trait Bird extends Animal:
  def canFly: Boolean

case class Dog(name: String) extends Mammal:
  def sound: String = "Bark"

case class Cat(name: String) extends Mammal:
  def sound: String = "Meow"

case class Eagle(name: String) extends Bird:
  def sound: String = "Screech"
  def canFly: Boolean = true

case class Penguin(name: String) extends Bird:
  def sound: String = "Squawk"
  def canFly: Boolean = false

def describeAnimal(animal: Animal): String = animal match
  case mammal: Mammal => s"${mammal.name} is a warm-blooded mammal and says '${mammal.sound}'"
  case bird: Bird => s"${bird.name} is a bird that ${if bird.canFly then "can" else "cannot"} fly and says '${bird.sound}'"

@main def runZooExample(): Unit =
  val animals = List(Dog("Buddy"), Cat("Whiskers"), Eagle("Majesty"), Penguin("Pingu"))
  animals.foreach(animal => println(describeAnimal(animal)))
