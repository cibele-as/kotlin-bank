package br.com.alura.bytebank.Model

class BonusCalculator {

    var total: Double = 0.0
            private set

    fun registrer(employee: Employee){
        this.total += employee.bonus
    }

//    fun registrer(manager:br.com.alura.bytebank.Model.Manager){
//        this.total += manager.bonus
//    }
//
//    fun registrer(director:br.com.alura.bytebank.Model.Director){
//        this.total += director.bonus
//    }


}