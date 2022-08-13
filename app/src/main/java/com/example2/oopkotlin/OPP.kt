package com.example2.oopkotlin

fun main (){
             var ss = mobilephone("android","samsung","s20")
              var sam = mobilephone("ios","iphone","4",2022)

    val person1 = Person("Denis", "Panjuta")

// Calls the secondary constructor
    val person2 = Person("Elon", "Musk", 48)
    println(ss.ver)
    println(sam.ver)


}

class mobilephone ( osname : String ,brand:String, model: String) {
    var ver: Int? = null
    set(value) {
        if (value != null) {
            field=value / 10
        }
    }
    var osname: String = osname
    get() = field.toUpperCase()

    var brand: String = brand
    var model: String = osname



    constructor(osname: String, brand: String, model: String, ver: Int) : this(osname, brand, model) {

        this.ver = ver
    }

    init {
        println("Here the osName is  ${this.osname} , brand is ${this.brand}, model is ${this.model},ver is ${this.ver} ")


    }
}

class Person(var firstName: String, var lastName: String) {
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var myFirstName = firstName

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }
    init {
        println("$age ")


    }

   // fun stateHobby(){
   //     println("$firstname \'s Hobby is: $hobby'" )
   // }
}
