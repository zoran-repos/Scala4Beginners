//This code can execute in the Scala REPL
//To run this code in the Scala REPL, copy and paste the code into the REPL
//but first, you need to start the Scala REPL by running the command `scala` in the terminal
//Then you can copy and paste the code into the REPL


/* Example 1
val name = "Scala"
var age = 30
println(s"Name: $name, Age: $age")
*/

/* Example 2
def greet(name: String): String = {
  s"Hello, $name!"
}
println(greet("Andrej"))
*/


/* Example 3
val numbers = List(1, 2, 3, 4, 5)
val doubledNumbers = numbers.map(_ * 2)
println(doubledNumbers)
*/


/* Example 4
val evenNumbers = numbers.filter(_ % 2 == 0)
println(evenNumbers)
*/


/* Example 5
val person = ("Andrej", 30, "Developer")
println(s"Name: ${person._1}, Age: ${person._2}, Occupation: ${person._3}")
*/

/* Example 6
val ages = Map("Alice" -> 25, "Bob" -> 28, "Charlie" -> 32)
val incrementedAges = ages.view.mapValues(_ + 1).toMap
println(incrementedAges)
*/

/*  Example 7
def factorial(n: Int): Int = {
  if (n <= 1) 1
  else n * factorial(n - 1)
}
println(factorial(5))
*/

/* Example 8
for (i <- 1 to 5) {
  println(s"Number: $i")
}
*/

/* Example 9
def checkNumber(num: Int): String = num match {
  case 1 => "One"
  case 2 => "Two"
  case _ => "Other"
}
println(checkNumber(2))
println(checkNumber(10))
*/

/* Example 10
val someValue: Option[Int] = Some(10)
val noneValue: Option[Int] = None

println(someValue.getOrElse(0))
println(noneValue.getOrElse(0))
*/