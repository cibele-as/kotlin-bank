package br.com.alura.bytebank.Exception
import java.lang.Exception

class InsufficientBalanceException(
    mensagem: String = "The Balance is insufficient") : Exception(mensagem)
