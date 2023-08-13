package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Model.*

fun testEmployee() {
    val alex = Analyt(
        name = "Alex",
        cpf = "111.111.111-11",
        salary = 1000.0

    )

    println("Name: ${alex.name}")
    println("Cpf: ${alex.cpf}")
    println("Salary: ${alex.salary}")
    println("Bonus: ${alex.bonus}")

    val fran = Manager(
        name = "Fran",
        cpf = "222.222.222-22",
        salary = 2000.0,
        password = 1234
    )

    println("Name: ${fran.name}")
    println("Cpf: ${fran.cpf}")
    println("Salary: ${fran.salary}")
    println("Bonus ${fran.bonus}")

    if (fran.authentic(1234)) {
        println("Success Authentication")
    } else {
        println("Failed Authentication")
    }

    val gui: Director = Director(
        name = "Gui",
        cpf = "333.333.333-33",
        salary = 4000.0,
        plr = 200.0,
        password = 4000
    )

    println("Name: ${gui.name}")
    println("Cpf: ${gui.cpf}")
    println("Salary: ${gui.salary}")
    println("Bonus ${gui.bonus}")

    if (gui.authentic(4000)) {
        println("Success Authentication")
    } else {
        println("Failed Authentication")
    }

    val maria: Employee = Analyt(
        name = "Maria",
        cpf = "444.444.444-44",
        salary = 3000.0
    )


    var calculator = BonusCalculator()
    calculator.registrer(alex)
    calculator.registrer(fran)
    calculator.registrer(gui)
    calculator.registrer(maria)

    println("Total Calculator Bonus: ${calculator.total}")
}