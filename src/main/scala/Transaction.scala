abstract class Transaction(val amount: Double, val accountId: String)

case class Deposit(override val accountId: String, override val amount: Double) extends Transaction(amount, accountId)
case class Withdrawal(override val accountId: String, override val amount: Double) extends Transaction(amount, accountId)
case class Transfer(val fromAccountId: String, toAccountId: String, override val amount: Double) extends Transaction(amount, fromAccountId)

def processTransaction(transaction: Transaction): String = transaction match
  case Deposit(accountId, amount) => s"Depositing $$${amount} to account $accountId"
  case Withdrawal(accountId, amount) => s"Withdrawing $$${amount} from account $accountId"
  case Transfer(fromAccountId, toAccountId, amount) =>
    s"Transferring $$${amount} from account $fromAccountId to account $toAccountId"

@main def runTransactionExample(): Unit =
  val transactions: List[Transaction] = List(
    Deposit("A123", 100.0),
    Withdrawal("A123", 50.0),
    Transfer("A123", "B456", 75.0)
  )

  transactions.foreach(transaction => println(processTransaction(transaction)))