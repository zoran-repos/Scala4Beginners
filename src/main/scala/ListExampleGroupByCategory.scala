@main def runProductExample(): Unit = {
  case class Product(name: String, price: Double, category: String)

  val products = List(
    Product("Laptop", 1500.0, "Electronics"),
    Product("Smartphone", 800.0, "Electronics"),
    Product("Shirt", 30.0, "Clothing"),
    Product("Jeans", 50.0, "Clothing"),
    Product("Blender", 100.0, "Home Appliance"),
    Product("Caffe Grinder", 30.0, "Home Appliance"),
    Product("TV", 1200.0, "Electronics")
  )

  val productsByCategory = products.groupBy(_.category)
  println("Products by category:")
  productsByCategory.foreach { case (category, list) =>
    println(s"$category: ${list.map(_.name).mkString(", ")}")
  }

  val averagePriceByCategory = productsByCategory.map { case (category, list) =>
    val averagePrice = list.map(_.price).sum / list.size
    (category, averagePrice)
  }
  println("Average price by category:")
  averagePriceByCategory.foreach { case (category, avg) => println(s"$category: $avg") }
}