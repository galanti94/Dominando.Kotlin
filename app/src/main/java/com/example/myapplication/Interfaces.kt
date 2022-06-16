package com.example.myapplication

//Uma implementação "padrão" para outras classes
interface Drivable {

    val maxSpeed: Double
    fun drive(): String
    fun brak() {
        println("está freando!")
    }
}

open class Car(override val maxSpeed: Double,
                 val nome: String, val marca: String): Drivable {
    open var range: Double = 0.0

    fun extendRange(amount:Double){
        if(amount > 0) {
            range += amount
        }
    }

    //Preciso usar essa estrutura para trabalhar; usamos return
    override fun drive(): String = "Driving Normal Car!" //return implícito
}

class EletricCar(maxSpeed: Double, nome: String, marca: String): Car(maxSpeed, nome, marca) {

    override fun drive(): String = "Driving Eletric Car!"
}

fun main() {

    val Tesla = EletricCar(350.0, "Model-S", "Tesla")
    val AudiA3 = Car(400.0, "Audi-A3", "Audi")

    println(Tesla.drive())
    println(AudiA3.drive())
    println("--------------------")

    Tesla.brak()
    AudiA3.brak()
    println("--------------------")

}