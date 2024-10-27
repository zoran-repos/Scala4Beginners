abstract class InventoryItem[T](val name: String, val price: Double) {
  def description: String
  def finalPrice(discount: T): Double
}

trait Discountable[T] {
  def applyDiscount(item: InventoryItem[T], discount: T): Double
}

class Book(name: String, price: Double, val author: String) extends InventoryItem[Double](name, price) with Discountable[Double] {
  override def description: String = s"Book: $name by $author"
  override def finalPrice(discount: Double): Double = applyDiscount(this, discount)
  override def applyDiscount(item: InventoryItem[Double], discount: Double): Double = {
    item.price - (item.price * discount / 100)
  }
}

class Electronics(name: String, price: Double, val brand: String) extends InventoryItem[(Int, Boolean)](name, price) with Discountable[(Int, Boolean)] {
  override def description: String = s"Electronics: $name by $brand"
  override def finalPrice(discount: (Int, Boolean)): Double = applyDiscount(this, discount)
  override def applyDiscount(item: InventoryItem[(Int, Boolean)], discount: (Int, Boolean)): Double = {
    val (percentage, isUnderWarranty) = discount
    val baseDiscount = item.price * percentage / 100
    if (!isUnderWarranty) item.price - (baseDiscount + 20) else item.price - baseDiscount
  }
}

@main def runInventoryExamples(): Unit = {
  val book = new Book("The Scala Guide", 40.0, "Martin Odersky")
  println(book.description)
  println(s"Final price after 10% discount: ${book.finalPrice(10.0)}")

  val laptop = new Electronics("Laptop", 1200.0, "Dell")
  println(laptop.description)
  println(s"Final price with 15% discount, under warranty: ${laptop.finalPrice((15, true))}")
  println(s"Final price with 15% discount, no warranty: ${laptop.finalPrice((15, false))}")
}