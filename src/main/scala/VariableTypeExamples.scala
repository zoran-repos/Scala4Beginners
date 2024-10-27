@main def variableTypesExample(): Unit = {
  // Immutable variables (val) - cannot be changed after initialization
  val intVal: Int = 42
  val doubleVal: Double = 3.14159
  val floatVal: Float = 2.71828f
  val longVal: Long = 123456789L
  val shortVal: Short = 32767
  val byteVal: Byte = 127
  val charVal: Char = 'A'
  val booleanVal: Boolean = true
  val stringVal: String = "Hello, Scala!"

  // Mutable variables (var) - can be changed after initialization
  var mutableInt: Int = 10
  mutableInt = 20


  println(s"Integer (Int): $intVal")
  println(s"Double: $doubleVal")
  println(s"Float: $floatVal")
  println(s"Long: $longVal")
  println(s"Short: $shortVal")
  println(s"Byte: $byteVal")
  println(s"Char: $charVal")
  println(s"Boolean: $booleanVal")
  println(s"String: $stringVal")
  println(s"Mutable Int: $mutableInt")

  // Other data structures as variables
  val listVal: List[Int] = List(1, 2, 3)
  val tupleVal: (Int, String, Boolean) = (1, "Tuple", true)
  val setVal: Set[String] = Set("apple", "banana", "cherry")
  val mapVal: Map[String, Int] = Map("Alice" -> 25, "Bob" -> 30)

  // Display other data structures
  println(s"List: $listVal")
  println(s"Tuple: $tupleVal")
  println(s"Set: $setVal")
  println(s"Map: $mapVal")
}
