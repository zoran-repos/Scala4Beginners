abstract class Payment(val amount: Double):
  def processPayment(): String

trait CreditCard:
  def processCreditCardPayment(): String = "Processing payment through Credit Card"

trait PayPal:
  def processPayPalPayment(): String = "Processing payment through PayPal"

class CreditCardPayment(amount: Double) extends Payment(amount) with CreditCard:
  def processPayment(): String = processCreditCardPayment() + s" of $$${amount}"

class PayPalPayment(amount: Double) extends Payment(amount) with PayPal:
  def processPayment(): String = processPayPalPayment() + s" of $$${amount}"

@main def runPaymentExample(): Unit =
  val creditPayment = new CreditCardPayment(100.0)
  val paypalPayment = new PayPalPayment(150.0)
  println(creditPayment.processPayment())
  println(paypalPayment.processPayment())