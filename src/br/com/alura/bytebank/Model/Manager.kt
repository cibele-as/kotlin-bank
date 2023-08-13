package br.com.alura.bytebank.Model

class Manager (
    name: String,
    cpf: String,
    salary: Double,
    password: Int

    ): EmployeeAdmin(
    name=name,
    cpf=cpf,
    salary=salary,
    password=password
    ), Authentic
{
    override val bonus: Double
        get() {
            return + salary
        }
}