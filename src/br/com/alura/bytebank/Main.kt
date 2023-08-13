package br.com.alura.bytebank

import br.com.alura.bytebank.Model.Address
import br.com.alura.bytebank.Model.Client
import br.com.alura.bytebank.Model.SavingsAccount
import br.com.alura.bytebank.Test.testHOF


fun main() {
    testHOF()


}

private fun testRun() {
    val annualTax = 0.05
    val monthlyTax = annualTax / 12
    println("Monthly Tax = $monthlyTax")


    val savingsAccount = SavingsAccount(
        Owner = Client(name = "Alex ", cpf = "111.111.111 -11", password = 1234),
        accountNumber = 10001
    )
    savingsAccount.run {
        deposit(1000.0)
        balance * monthlyTax
    }.let { monthlyIncome ->
        println("Monthly Income $monthlyIncome")
    }

    val monthlyIncome = run {
        var balance = savingsAccount.balance
        repeat(12) { index ->
            balance += balance * monthlyTax
        }
        balance

    }
    println("Simulation Monthly Income $monthlyIncome")
}

fun testWith() {
    with(Address()) {
        street = "street vergueiro"
        number = 3185
        city = "Berlin"
        zipcode = "02310-064"

        complete()
    }.let { completeAddress: String ->
        println(completeAddress)
    }
}









