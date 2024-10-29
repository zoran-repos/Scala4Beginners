@main def valVarExample(): Unit = {
  val greeting: String = "Hello, Scala!"
  println(greeting)

  var counter: Int = 0
  println(s"Initial counter value: $counter")

  counter += 1
  println(s"Counter after increment: $counter")

  // This line would cause an error because 'greeting' is immutable
  // greeting = "Hello, again!"

  counter += 5
  println(s"Counter after adding 5: $counter")
}