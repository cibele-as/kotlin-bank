package br.com.alura.bytebank.Model

class Assistant (
    name: String,
    cpf: String,
    salary: Double

    ): Employee(name=name, cpf=cpf, salary=salary)
{
    override val bonus: Double
        get() = salary * 0.5

}