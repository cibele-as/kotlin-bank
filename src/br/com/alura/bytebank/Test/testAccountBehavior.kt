package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Exception.AuthenticationFailureException
import br.com.alura.bytebank.Exception.InsufficientBalanceException
import br.com.alura.bytebank.Model.CurrentAccount
import br.com.alura.bytebank.Model.SavingsAccount
import br.com.alura.bytebank.Model.Client



fun testAccountBehavior() {

    val alex = Client(name = "Alex", cpf = "", password = 1)

    val accountNumberAlex = CurrentAccount(Owner = alex, accountNumber = 1000)
    accountNumberAlex.deposit(200.0)

    println(accountNumberAlex.Owner)
    println(accountNumberAlex.accountNumber)
    println(accountNumberAlex.balance)

    val fran = Client(name = "Fran", cpf = "", password = 2)

    val accountNumberFran = SavingsAccount(accountNumber = 10001, Owner = fran)
    accountNumberFran.deposit(300.0)

    println(accountNumberFran.Owner)
    println(accountNumberFran.accountNumber)
    println(accountNumberFran.balance)


    println("depositing in the account of the Alex")
    accountNumberAlex.deposit(value = 50.0)
    println(accountNumberAlex.balance)

    println("depositing in the account of the Fran")
    accountNumberFran.deposit(value = 70.0)
    println(accountNumberFran.balance)

    println("withdraw in the account of the Alex")
    accountNumberAlex.withdraw(250.0)
    println(accountNumberAlex.balance)

    println("withdraw in the account of the Fran")
    accountNumberFran.withdraw(100.0)
    println(accountNumberFran.balance)

    println("excess withdrawing in the account of the Alex")
    accountNumberAlex.withdraw(100.0)
    println(accountNumberAlex.balance)

    println("excess withdrawing in the account of the Fran")
    accountNumberFran.withdraw(500.0)
    println(accountNumberFran.balance)

    println("Transfer from Fran account to Alex account")

        try {
            accountNumberFran.transfer(destino = accountNumberAlex, value = 250.0, password = 2)
            println("Success Transfer")
        } catch (e:InsufficientBalanceException){
            println(" Transfer Failure")
            println(" Balance is insulficient")
            e.printStackTrace()

        }catch (e:AuthenticationFailureException){
            println("Transfer failure")
            println("Authentication failure")
            e.printStackTrace()
        }catch (e: Exception){
            println("Unknown error")
            e.printStackTrace()

        }


    println(accountNumberAlex.balance)
    println(accountNumberFran.balance)


}



