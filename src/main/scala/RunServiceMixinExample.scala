trait Service:
  def execute(): String

trait EmailService extends Service:
  def execute(): String = "Sending email..."

trait SMSService extends Service:
  def execute(): String = "Sending SMS..."

class Application(val service: Service):
  def run(): Unit = println(service.execute())

@main def runServiceMixinExample(): Unit =
  val emailApp = new Application(new EmailService {})
  val smsApp = new Application(new SMSService {})
  emailApp.run()
  smsApp.run()
