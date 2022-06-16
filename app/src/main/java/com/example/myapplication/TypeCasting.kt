package com.example.myapplication

fun main(){

    var obj2: Any = 1000
    var str2: String? = obj2 as? String // nullable; não tenho certeza se funciona...

    var obj1: Any = 1000
    //var str1: String = obj1 as String

    //println(str1)
    println(str2)

}