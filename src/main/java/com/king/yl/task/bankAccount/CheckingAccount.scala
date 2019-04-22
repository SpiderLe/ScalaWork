package com.king.yl.task.bankAccount

class CheckingAccount(initialBalance:Double) extends BankAccount(initialBalance)  {

  override def deposit(amount :Double)={
    super.deposit(amount - 1)
  }

  override def withdraw(amount:Double)={
    super.withdraw(amount + 1)
  }

}
