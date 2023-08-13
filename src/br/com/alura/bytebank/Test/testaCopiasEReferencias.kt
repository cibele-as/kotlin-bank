package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Model.Client
import br.com.alura.bytebank.Model.CurrentAccount
import br.com.alura.bytebank.Model.SavingsAccount

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Client(name="Joao", cpf="", password=1)

    val accountOwnerJoao = CurrentAccount(joao,1002)
    accountOwnerJoao.Owner = joao
    var accountOwnerMaria = SavingsAccount(
        Client(name = "Maria", cpf = "", password = 2),
        1003
    )
    accountOwnerMaria.Owner.name = "Maria"
    accountOwnerJoao.Owner.name = "Joao"

    println("br.com.alura.bytebank.Model.Account Owner Joao: ${accountOwnerJoao.Owner}")
    println("br.com.alura.bytebank.Model.Account Owner Maria: ${accountOwnerMaria.Owner}")

    println(accountOwnerJoao)
    println(accountOwnerMaria)


}