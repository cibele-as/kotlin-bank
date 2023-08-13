package br.com.alura.bytebank.Model

abstract class EmployeeAdmin(
    name: String,
    cpf: String,
    salary: Double,
    val password:Int

    ): Employee(name=name,cpf=cpf,salary=salary){

    fun authentic(password: Int): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }

}

