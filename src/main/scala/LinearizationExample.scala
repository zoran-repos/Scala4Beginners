class Logger {
  def log(): Unit = println("Logger")
}

trait FileLogger extends Logger {
  override def log(): Unit = {
    println("FileLogger")
    super.log()
  }
}

trait DatabaseLogger extends Logger {
  override def log(): Unit = {
    println("DatabaseLogger")
    super.log()
  }
}

trait ConsoleLogger extends Logger {
  override def log(): Unit = {
    println("ConsoleLogger")
    super.log()
  }
}

trait TimestampLogger extends Logger {
  override def log(): Unit = {
    println("TimestampLogger")
    super.log()
  }
}

class Application extends Logger with FileLogger with DatabaseLogger with ConsoleLogger with TimestampLogger {
  override def log(): Unit = {
    println("Application-specific Logger")
    super.log()
  }
}

@main def LinearizationExample(): Unit = {
  val app = new Application()
  app.log()
}
