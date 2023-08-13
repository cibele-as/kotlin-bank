package br.com.alura.bytebank.Test

import br.com.alura.bytebank.Model.Client
import br.com.alura.bytebank.Model.Director
import br.com.alura.bytebank.Model.Manager
import br.com.alura.bytebank.Model.SystemInternal

fun testAuthentication() {
    val manager = Manager(
        name = "Alex",
        cpf = "111.111.111-11",
        salary = 1000.0,
        password = 1000
    )
    val director = Director(
        name = "Fran",
        cpf = "222.222.222-22",
        salary = 2000.0,
        password = 2000,
        plr = 200.0
    )

    val client = Client(
        name="Gui",
        cpf="333.333.333-33",
        password =1234
    )

    val system = SystemInternal()
    system.enter(manager, 1000)
    system.enter(director, 2000)
    system.enter(client,1234)
}