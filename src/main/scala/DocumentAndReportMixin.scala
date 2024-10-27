trait Printable:
  def printContent(): String
  def print(): Unit = println(printContent())

class Document(val title: String, val content: String) extends Printable:
  def printContent(): String = s"Title: $title\nContent: $content"

class Report(val name: String, val data: String) extends Printable:
  def printContent(): String = s"Report: $name\nData: $data"

@main def runPrintableMixinExample(): Unit =
  val document = new Document("Scala Guide", "This is a guide to Scala.")
  val report = new Report("Sales", "Sales data for Q1.")
  document.print()
  report.print()
