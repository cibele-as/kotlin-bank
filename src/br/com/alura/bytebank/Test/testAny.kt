package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Model.Address

fun testAny () {

    val address = Address(
        street = "SchonStrasse",
        city = "Berlin",
        zipcode = "00000-000"
    )
    val addressnew = Address(
        street = "SchonStrasse",
        city = "Berlin",
        zipcode = "00000-000"
    )

    println(address.equals(addressnew))

    println(address.hashCode())
    println(addressnew.hashCode())

    println(address.toString())
    println(addressnew.toString())

    println("${address.javaClass}@${Integer.toHexString(address.hashCode())}")


    fun print(value: Any): Any {
        println(value)
        return value

    }
}