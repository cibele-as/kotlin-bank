package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Model.Address
import br.com.alura.bytebank.Model.Client
import br.com.alura.bytebank.Model.CurrentAccount
import br.com.alura.bytebank.Model.SavingsAccount


fun println(s: String, function: () -> String) {

}

fun testDifferentAccounts() {
    val currentAccount = CurrentAccount(Owner = Client("Alex", "111.111.111-11", address = Address(street = "Street True"), 1), accountNumber = 1000)

    println("Owner")
    println("Owner Name${currentAccount.Owner.name}")
    println("Onwer CPF${currentAccount.Owner.cpf}")
    println("Owner Address${currentAccount.Owner.address.street}")


    val savingsAccount = SavingsAccount(
        Owner = Client(name="Maria", cpf="", password=2),
        accountNumber = 1001
    )

    currentAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("Value Current br.com.alura.bytebank.Model.Account: ${currentAccount.balance}")
    println("value Savings br.com.alura.bytebank.Model.Account:${savingsAccount.balance}")

    currentAccount.withdraw(100.0)
    savingsAccount.withdraw(100.0)

    println("Value after withdraw Current br.com.alura.bytebank.Model.Account:${currentAccount.balance}")
    println("Value after withdraw Savings br.com.alura.bytebank.Model.Account:${savingsAccount.balance}")

    currentAccount.transfer(100.0, savingsAccount, 1)

    println("Value after transfer from Current br.com.alura.bytebank.Model.Account to Savings br.com.alura.bytebank.Model.Account:${currentAccount.balance} ")
    println("Value after transfer from Current br.com.alura.bytebank.Model.Account to Savings br.com.alura.bytebank.Model.Account:${savingsAccount.balance}")

    savingsAccount.transfer(200.0, currentAccount, 2)

    println("Value after transfer from Savings br.com.alura.bytebank.Model.Account to Current br.com.alura.bytebank.Model.Account:${savingsAccount.balance}")
    println("Value after transfer from Savings br.com.alura.bytebank.Model.Account to Current br.com.alura.bytebank.Model.Account:${currentAccount.balance}")
}