package br.com.alura.bytebank.Model

class Client (
    var name:String,
    val cpf:String,
    var address : Address = Address(),
    val password:Int
): Authentic {
    override fun authentic(password: Int): Boolean {
            if (this.password == password) {
                return true
            }
            return false
        }
    }





