trait Database:
  def query(sql: String): String

trait UserRepository:
  this: Database =>
  //this: Database => inside a trait or class specifies that any concrete instance of this trait 
  // must also mix in another trait or class (in this case, Database).
  def findUser(userId: String): String = query(s"SELECT * FROM users WHERE id = '$userId'")

class MySQLDatabase extends Database:
  def query(sql: String): String = s"MySQL executing query: $sql"

class UserService extends MySQLDatabase with UserRepository

@main def runSelfTypeMixinExample(): Unit =
  val userService = new UserService()
  println(userService.findUser("123"))
