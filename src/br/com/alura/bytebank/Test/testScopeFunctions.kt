package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Model.Address

fun testScopeFunctions() {
    //    val address = Address (street="street vergueiro", number = 3185)
//    val addressUpperCase = "${address.street}, ${address.number}".uppercase()
//    println(addressUpperCase)


    val address = Address()
//         .also {println("Create address")}
        .apply {
            street = "street vergueiro"
            number = 3185
        }
    with(address) {
        "$street, $number".uppercase()
    }.let { addressWithUppercase: String ->
        println(addressWithUppercase)
    }


    listOf(
        Address(city = "Berlin"),
        Address(),
        Address(city = "Brazil")
    )
        .filter(predicate = { address -> address.city.isNotEmpty() })
        .let(block = (::println))
}

