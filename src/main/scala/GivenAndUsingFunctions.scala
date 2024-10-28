@main def greetUser(): Unit =
  def greet(name: String)(using language: String): String =
    language match
      case "fr" => s"Bonjour, $name!"
      case "de" => s"Hallo, $name!"
      case _ => s"Hello, $name!"

  given String = "fr"
  println(greet("Andrej"))
