package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Exception.InsufficientBalanceException

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: InsufficientBalanceException){
        println("InsufficientBalanceException was taken")
        e.printStackTrace()

    }

    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        throw InsufficientBalanceException()

        println("fim funcao2")
    }
}