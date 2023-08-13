package br.com.alura.bytebank.Model



abstract class Account(var Owner:Client,
                       val accountNumber:Int) : Authentic{
    var balance = 0.0
        protected set

   companion object {
        var total = 0
        private set

    }

    init {
        total++

    }


    override fun authentic(password: Int): Boolean {
        return Owner.authentic(password)
    }


    open fun deposit(value: Double) {
        this.balance += value

    }


    abstract fun withdraw(value: Double)


}

class CurrentAccount(Owner: Client,
                     accountNumber: Int
) : TransferableAccount(
    Owner = Owner,
    accountNumber = accountNumber
){



    override fun withdraw(value: Double) {
        val valuewithtax = value + 0.1
        if(this.balance >= valuewithtax){
            this.balance -= valuewithtax

            if (this.balance >= valuewithtax) {
                this.balance -= valuewithtax
            }

        }
    }

}

class SavingsAccount(Owner: Client,
                     accountNumber: Int
) : TransferableAccount(
    Owner = Owner,
    accountNumber = accountNumber
) {


    override fun withdraw(value: Double) {
        if (this.balance >= value) {
            if (this.balance >= value) {
                this.balance -= value
            }
        }
    }
}