package com.example.helloworld

fun main() {
    /*
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

    var me = Person("Ella","S")
    me.stateHobby()

    var myCar = Car()
    println(myCar.owner)
    println(myCar.myBrand)
     */

    val user1 = User(1,"Ella")
    println(user1.name)

}

class Person (firstName: String = "DefaultFirstName", lastName: String = "DefaultLastName") {
    // Member variables - properties
    var age : Int? = null
    var hobby: String = "watch Netflix"

    // initializer block
    init {
        println("$firstName is nice")
    }

    // Member secondary constructor
    constructor(firstName: String, lastName: String, age: Int):
            // this means that the firstName and lastName come from our prime constructor
            this(firstName,lastName) {
        this.age = age

    }

    // Member functions - Methods
    fun stateHobby() {
        println("My hobby is $hobby")
    }


}

class Car() {
    lateinit var owner: String

    val myBrand: String = "BMW"
        // custom getter to myBrand
    get() {
        return field.toLowerCase()
    }

    var myModel: String = "M5"
    // only available within the same class
        private set

    init {
        this.owner = "Frank"
    }
}

data class User(val id: Long, val name: String) {

}