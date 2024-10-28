@main def processOrders(): Unit =
  val calculateTotal = (price: Double, quantity: Int) => price * quantity
  val total = calculateTotal(19.99, 5)
  println(s"Total cost: $$${total}")