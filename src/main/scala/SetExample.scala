@main def setExample(): Unit =

  val primaryColors: Set[String] = Set("Red", "Blue", "Yellow")
  val secondaryColors: Set[String] = Set("Green", "Purple", "Orange", "Blue")
  val mixedColors: Set[String] = Set("Blue", "Yellow", "Green", "Black", "White")

  val allColors: Set[String] = primaryColors ++ secondaryColors ++ mixedColors
  val commonColors: Set[String] = primaryColors & secondaryColors & mixedColors
  val uniquePrimaryColors: Set[String] = primaryColors -- (secondaryColors ++ mixedColors)
  val distinctColors: Set[String] = allColors -- commonColors

  val colorExists: Boolean = allColors.contains("Blue")
  val colorSizes: (Int, Int, Int, Int) = (primaryColors.size, secondaryColors.size, mixedColors.size, allColors.size)

  val modifiedColors: Set[String] = allColors.map(_.toLowerCase).filter(_.startsWith("b"))
  val colorPairs: Set[(String, Int)] = allColors.zipWithIndex


  println(s"All colors: $allColors")
  println(s"Common colors: $commonColors")
  println(s"Unique primary colors: $uniquePrimaryColors")
  println(s"Distinct colors: $distinctColors")
  println(s"Color exists in all colors: $colorExists")
  println(s"Set sizes: $colorSizes")
  println(s"Modified colors (starting with 'b'): $modifiedColors")
  println(s"Color pairs with index: $colorPairs")
