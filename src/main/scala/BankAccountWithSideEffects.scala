class BankAccountWithSideEffects(val accountNumber: String, private var balance: Double):

  def deposit(amount: Double): Unit =
    if amount > 0 then balance += amount

  def withdraw(amount: Double): Boolean =
    if amount > 0 && amount <= balance then
      balance -= amount
      true
    else
      false

  def getBalance: Double = balance

  override def toString: String = s"Account $accountNumber has balance $$${balance}"

object BankAccountWithSideEffects:

  def apply(accountNumber: String, initialDeposit: Double): BankAccountWithSideEffects =
    val account = new BankAccountWithSideEffects(accountNumber, 0)
    account.deposit(initialDeposit)
    account

  def transfer(from: BankAccountWithSideEffects, to: BankAccountWithSideEffects, amount: Double): Boolean =
    if from.withdraw(amount) then
      to.deposit(amount)
      true
    else
      false

@main def runBankApp(): Unit =
  val account1 = BankAccountWithSideEffects.apply("123456789", 1000.0)
  val account2 = BankAccountWithSideEffects.apply("987654321", 500.0)

  println(account1)
  println(account2)

  BankAccountWithSideEffects.transfer(account1, account2, 200.0)

  println(account1)
  println(account2)