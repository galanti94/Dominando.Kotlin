package com.example.myapplication

fun main(){

    val meses = listOf("Janeiro", "Fevereiro", "Março")

    val mesesMutaveis = meses.toMutableList()
    val novosMeses = arrayOf("Agosto", "Setembro", "Outubro")
    mesesMutaveis.addAll(novosMeses)

    println(meses)
    println(mesesMutaveis)

    val frutas = mutableListOf<Frutas>()

    frutas.add(Frutas("Abacaxi", 1.5))

    println(frutas[0].nome)


}
