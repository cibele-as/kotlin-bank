package br.com.alura.bytebank.Test

fun testLacos() {

    var i = 0
    while (i < 5) {
        val Owner: String = "Alex $i"
        val accountNumber: Int = 1000 + i
        var balance = i + 10.0
        println(message = "owner $Owner")
        println("accountNumber $accountNumber")
        println("balance $balance")

        println()
        i++
    }
}