package com.example.myapplication

import kotlin.math.absoluteValue

data class User (var id: Long, var name: String) // classe que armazena dados

fun main(){
    val user1 = User(2, "Guilherme")
    val user2 = User(1, "Karol")
    println(user1.name == user2.name)

    val updateUser = user1.copy(name = "Gui")
    println(updateUser)

    val (id,  nome) = updateUser
    println("id $id nome é $nome")
}
