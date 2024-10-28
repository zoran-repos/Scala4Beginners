@main def compareAges(): Unit =
  case class Person(name: String, age: Int):
    def isOlderThan(other: Person): Boolean = this.age > other.age

  val alice = Person("Alice", 30)
  val bob = Person("Bob", 25)

  println(alice.isOlderThan(bob))