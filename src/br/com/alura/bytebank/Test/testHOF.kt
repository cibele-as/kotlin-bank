package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Model.Authentic
import br.com.alura.bytebank.Model.SystemInternal


fun testHOF() {
    sum(1, 5, result = { value ->
        println(value)

    })

    sumReceiver(1,5, result = {
        println(this)
    })


    val authenticated = object : Authentic {
        val password = 1234
        override fun authentic(password: Int) = this.password == password

    }

    val system = SystemInternal()
    system.enter(authenticated, password = 1234, authenticated = {
        println("Payment made")
    })

    system.enterRecever(authenticated, 1234, authenticated = {
        payment()
    })
}

fun sum (a: Int, b: Int, result: (Int) -> Unit) {
    println("Before sum")
    result(a + b)
    println("After sum")
}

fun sumReceiver (a: Int, b: Int, result: Int.() ->Unit){
    println("Before sum")
    val total = a+b
    total.result()
    println("After sum")
}

fun payment(){
    println("Make payment")
}




//fun testReceiveString (value: String){
//
//}
//// Higher oder Function
//    fun test (test: Int, block : () -> Unit) {
//
//}
