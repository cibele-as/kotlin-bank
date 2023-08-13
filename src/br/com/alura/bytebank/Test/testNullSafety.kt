package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Model.Address

fun nullSafety() {
    var addressNull: Address? = Address(street = "Berliner Strasse", city = "Berlin")
    val streetnew: String? = addressNull?.street
    addressNull?.let {
        println(it.street.length)
        val sizeCity: Int =
            it.city?.length ?: throw IllegalStateException("City can not be exited")
        println(sizeCity)
    }
}