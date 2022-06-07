package com.example.myapplication

// Super Class or Parent Class or Base Class
open class Veiculo { //precisa estar open para herdar

}

open class Carro(val nome: String, val marca: String): Veiculo() {
    open var range: Double = 0.0

    fun extendRange(amount:Double){
        if(amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double){
        println("Drive for $distance km")
    }

}

class CarroEletrico(nome: String, marca: String, bateria: Double): Carro(nome, marca){

    override var range = bateria * 6

    override fun drive(distance: Double) {
        println("Drive for $distance km with electricity")
    }

    fun drive(){
        println("Drive for $range")
    }

}

fun main(){
    val myCar = Carro("A3", "Audi")
    val myEletricCar = CarroEletrico("Model 3", "Tesla", 900.0)

    myCar.drive(200.0)
    myEletricCar.drive()

    //Polimosfismo - tratando coisas diferentes como iguais
    myEletricCar.extendRange(100.0)
    myEletricCar.drive(200.0)
}