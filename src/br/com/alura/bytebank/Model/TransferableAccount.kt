package br.com.alura.bytebank.Model

import Exception.AuthenticationFailureException
import Exception.InsufficientBalanceException
import java.lang.NumberFormatException

abstract class TransferableAccount (
    Owner: Client,
    accountNumber: Int): Account(Owner, accountNumber) {


    fun transfer(value: Double, destino: Account, password: Int) {
        if (balance < value) {
            throw InsufficientBalanceException(
                mensagem = "The balance is insufficient: $balance, the value to be subtracted $value"
            )
        }

        if (!authentic(password)){
            throw AuthenticationFailureException()

        }
//            throw NumberFormatException()


            balance -= value
            destino.deposit(value)
        }
    }












