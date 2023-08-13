package br.com.alura.bytebank.Test

import java.lang.NumberFormatException

fun testExpression(enter: String) {
    val valueReceived: Double? = try {
        enter.toDouble()
    } catch (e: NumberFormatException) {
        println("Conversation Problem")
        e.printStackTrace()
        null
    }

    val valueWithTax: Double? = if (valueReceived != null) {
        valueReceived + 0.1
    } else {
        null
    }

    if (valueWithTax != null) {
        println("Value received: $valueWithTax")

    } else {
        println("Value invalid")
    }
}