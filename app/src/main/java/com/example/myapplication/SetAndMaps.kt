package com.example.myapplication

fun main() {

    val fruits = setOf("Apple", "Grapes", "Apple", "Orange")
    println(fruits)

    val newFruits = fruits.toMutableList()
    newFruits.add("Avocado")
    println(newFruits)

    // maps, hasmaps ou dictionaries
    val week = mapOf(1 to "sogunda", 2 to "terça", 3 to "quarta")

    for(key in week.keys) {
        println(week[key])
    }

    val newWeek = week.toMutableMap()
    newWeek[4] = "quinta"
}