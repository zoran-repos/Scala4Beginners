trait Greeting:
  def greet(name: String): String = s"Hello, $name!"

class Person(val name: String)

class FriendlyPerson(name: String) extends Person(name) with Greeting

@main def runBasicMixinExample(): Unit =
  val person = new FriendlyPerson("Alice")
  println(person.greet(person.name))
