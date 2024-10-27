trait Shape:
  def area: Double
  def perimeter: Double

case class Circle(radius: Double) extends Shape:
  def area: Double = math.Pi * radius * radius
  def perimeter: Double = 2 * math.Pi * radius

case class Rectangle(width: Double, height: Double) extends Shape:
  def area: Double = width * height
  def perimeter: Double = 2 * (width + height)

def describeShape(shape: Shape): String = shape match
  case Circle(radius) => s"A circle with radius $radius, area: ${shape.area}, perimeter: ${shape.perimeter}"
  case Rectangle(width, height) => s"A rectangle with width $width, height $height, area: ${shape.area}, perimeter: ${shape.perimeter}"

@main def runShapeExample(): Unit =
  val shapes = List(Circle(5.0), Rectangle(4.0, 6.0))
  shapes.foreach(shape => println(describeShape(shape)))
