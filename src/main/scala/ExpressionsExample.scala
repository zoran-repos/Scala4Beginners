sealed trait Expression:
  def evaluate: Double

case class Number(value: Double) extends Expression:
  def evaluate: Double = value

case class Addition(left: Expression, right: Expression) extends Expression:
  def evaluate: Double = left.evaluate + right.evaluate

case class Multiplication(left: Expression, right: Expression) extends Expression:
  def evaluate: Double = left.evaluate * right.evaluate

def evaluateExpression(expr: Expression): Double = expr match
  case Number(value) => value
  case Addition(left, right) => evaluateExpression(left) + evaluateExpression(right)
  case Multiplication(left, right) => evaluateExpression(left) * evaluateExpression(right)

@main def runExpressionExample(): Unit =
  val expr = Addition(Number(5), Multiplication(Number(2), Number(3)))
  println(s"Expression result: ${evaluateExpression(expr)}")
