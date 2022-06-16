package com.example.myapplication

fun main() {

    //val numbers: IntArray = intArrayOf(1, 3, 6, 8, 11, 109)
    //val numbers = intArrayOf(1, 3, 6, 8, 11, 109) //Não precisa especificar
    var numbers = arrayOf(1, 3, 6, 8, 11, 109) //Não precisa especificar nem o tipo

    //println(numbers.contentToString())
/*
    for(element in numbers){
        println(element)
    }

    println(numbers[0])*/

    val frutas = arrayOf(Frutas("Abacaxi", 3.5), Frutas("Maça", 1.5))

    for(index in frutas.indices){
        println(frutas[index].nome)
    }

    val mix = arrayOf("Guilherme", Frutas("Mamão", 7.3), 1.01) // perigoso, mistura tudo

}

data class Frutas(val nome: String, val preco: Double)