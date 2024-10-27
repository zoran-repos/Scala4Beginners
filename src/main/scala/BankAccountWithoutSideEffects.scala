class BankAccountWithoutSideEffects(val accountNumber: String, private val balance: Double):

  private def withdraw(amount: Double): (BankAccountWithoutSideEffects, Boolean) =
    if amount > 0 && amount <= balance then
      (new BankAccountWithoutSideEffects(accountNumber, balance - amount), true)
    else
      (this, false)

  private def deposit(amount: Double): BankAccountWithoutSideEffects =
    if amount > 0 then new BankAccountWithoutSideEffects(accountNumber, balance + amount)
    else this

  private def getBalance: Double = balance

  override def toString: String = s"Account $accountNumber has balance $$${balance}"

object BankAccountWithoutSideEffects:

  def apply(accountNumber: String, initialDeposit: Double): BankAccountWithoutSideEffects =
    val account = new BankAccountWithoutSideEffects(accountNumber, 0)
    account.deposit(initialDeposit)

  def transfer(from: BankAccountWithoutSideEffects, to: BankAccountWithoutSideEffects, amount: Double): (BankAccountWithoutSideEffects, BankAccountWithoutSideEffects, Boolean) =
    val (updatedFrom, success) = from.withdraw(amount)
    if success then
      val updatedTo = to.deposit(amount)
      (updatedFrom, updatedTo, true)
    else
      (from, to, false)

@main def runBankAppWithoutSideEffects(): Unit =
  val account1 = BankAccountWithoutSideEffects.apply("123456789", 1000.0)
  val account2 = BankAccountWithoutSideEffects.apply("987654321", 500.0)

  println(account1)
  println(account2)

  val (updatedAccount1, updatedAccount2, success) = BankAccountWithoutSideEffects.transfer(account1, account2, 200.0)

  if success then
    println("Transfer successful")
  else
    println("Transfer failed")

  println(updatedAccount1)
  println(updatedAccount2)