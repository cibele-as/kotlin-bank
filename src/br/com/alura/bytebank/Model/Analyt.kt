package br.com.alura.bytebank.Model

class Analyt (
    name: String,
    cpf: String,
    salary: Double

    ): Employee(name=name, cpf=cpf, salary=salary)
{
    override val bonus: Double
        get() {
            return + salary * 0.1
        }

}