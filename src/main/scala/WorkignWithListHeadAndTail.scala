@main def runExampleWithFruitsAndVegetables(): Unit = {
  val fruits = "Apple" :: "Banana" :: "Cherry" :: Nil
  val vegetables = "Carrot" :: "Tomato" :: "Pepper" :: Nil

  val fruitsAndVegetables = fruits ::: vegetables
  val moreItems = "Mango" :: "Orange" :: fruitsAndVegetables

  println(s"Fruits: $fruits")
  println(s"Vegetables: $vegetables")
  println(s"Combined: $fruitsAndVegetables")
  println(s"More items: $moreItems")

  println(s"Head of moreItems: ${moreItems.head}")
  println(s"Tail of moreItems: ${moreItems.tail}")
}