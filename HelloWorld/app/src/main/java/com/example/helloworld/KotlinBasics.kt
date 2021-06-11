package com.example.helloworld

fun main() {
    var myName = "Ella" //we create a variable. val can't be mutable , but var can be
    println("Hello $myName")

    val month = 3
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Hello Winter")
        else -> println("Invalid month")
    }
    //we can also do this with types
    var x: Any = 13.37
    when(x) {
        is Int -> println("Int")
        is String -> println("String")
        is Double -> println("Double")
    }
}