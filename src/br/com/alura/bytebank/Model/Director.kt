package br.com.alura.bytebank.Model

class Director (
    name: String,
    cpf: String,
    salary: Double,
    password: Int,
    val plr: Double

    ): EmployeeAdmin(
    name=name,
    cpf=cpf,
    salary=salary,
    password= password
    ), Authentic
{

    override val bonus: Double
        get() {
            return + salary + plr
        }


}