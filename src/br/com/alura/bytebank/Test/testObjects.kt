package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Model.Account
import br.com.alura.bytebank.Model.Client
import br.com.alura.bytebank.Model.CurrentAccount
import br.com.alura.bytebank.Model.SavingsAccount

fun testObjects() {
    //        val fran = object: Authentic {
//               val name: String = "Fran"
//               val cpf: String = "111.111.111-11"
//               val password: Int = 1000
//
//
//           override fun authentic (password: Int) = this.password == password
//
//        }
//
//        val systemInternal = SystemInternal()
//        systemInternal.enter(fran, password = 1000)
//
//        println("Client Name: ${fran.name}")


    val alex = Client(name = "Alex", cpf = "", password = 1)
    val savingsAccount = SavingsAccount(Owner = alex, accountNumber = 1000)
    val currentAccount = CurrentAccount(Owner = alex, accountNumber = 1001)


    println("Total Accounts: ${Account.total}")
}