trait Greeting:
  def greet(name: String): String = s"Hello, $name!"

trait Checking:
  def check(name: String): String => Int = (s: String) => s.length

class Person(val name: String)

class FriendlyPerson(name: String) extends Person(name) with Greeting with Checking

@main def runBasicMixinExample(): Unit =
  val person = new FriendlyPerson("Alice")
  val lengthOfName = person.check(person.name)(person.name)

  println("Length of name of Person is " + lengthOfName)

  println(person.greet(person.name))