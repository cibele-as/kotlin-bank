package br.com.alura.bytebank.Test

fun testaCondicoes(balance: Double) {
    if (balance > 0.0) {
        println("balance is positive")
    } else if (balance == 0.0) {
        println("balance is neutral")
    } else {
        println("balance is negative")
    }
}