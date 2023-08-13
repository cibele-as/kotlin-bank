package br.com.alura.bytebank.Model

class SalaryAccount(Owner:Client, accountNumber:Int): Account(Owner, accountNumber) {

    override fun withdraw(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }

    }
}
