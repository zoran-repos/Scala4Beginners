trait Database:
  def query(sql: String): String

trait UserRepository:
  this: Database =>
  def findUser(userId: String): String = query(s"SELECT * FROM users WHERE id = '$userId'")

class MySQLDatabase extends Database:
  def query(sql: String): String = s"MySQL executing query: $sql"

class UserService extends MySQLDatabase with UserRepository

@main def runSelfTypeMixinExample(): Unit =
  val userService = new UserService()
  println(userService.findUser("123"))
