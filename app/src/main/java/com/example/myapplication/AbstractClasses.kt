package com.example.myapplication

abstract class Mamiferos(
    val nome: String,
    private val origem: String, private val peso: Double) {

    abstract var velocidadeMaxima: Double

    abstract fun correr()
    abstract fun respirar()

    // Não estamos presos a apenas metodos abstratos
    fun detalhes(){
        println("Nome: $nome, Origem $origem, Peso: $peso")
    }
}

class Humano(override var velocidadeMaxima: Double, nome: String,
             origem: String, peso: Double): Mamiferos(nome, origem, peso){

    override fun correr() {
        println("${this.nome} está correndo!")
    }

    override fun respirar() {
        println("${this.nome} está respirando!")
    }
}

class Elefante(override var velocidadeMaxima: Double, nome: String,
             origem: String, peso: Double): Mamiferos(nome, origem, peso){

    override fun correr() {
        println("${this.nome} está correndo!")
    }

    override fun respirar() {
        println("${this.nome} está respirando!")
    }
}

fun main(){
    var gui = Humano(28.0, "Guilherme", "Brasil", 105.0)
    var elefante = Elefante(50.0, "Dumbo", "Africa", 1000.0)

    gui.correr()
    gui.respirar()
    gui.detalhes()

    elefante.correr()
    elefante.respirar()
    elefante.detalhes()
}