package br.com.alura.bytebank.Model

class Address (
    var street: String ="",
    var number: Int= 0,
    var city: String="",
    var zipcode: String=""
){
    override fun toString(): String {
        return """
            Address(street='$street', 
            number=$number, 
            city='$city', 
            zipcode='$zipcode')""".trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (street != other.street) return false
        if (number != other.number) return false
        if (city != other.city) return false
        if (zipcode != other.zipcode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = street.hashCode()
        result = 31 * result + number
        result = 31 * result + city.hashCode()
        result = 31 * result + zipcode.hashCode()
        return result
    }

    fun complete(): String {
        return """
$street - $number , $city 
$zipcode
            
 """.trimIndent()
    }


}

