package com.yangd.kotlininaction_2.XI.III

class Greeter(val greeting:String) {
    operator fun invoke(name:String) {
        println("$greeting, $name!")
    }
}

fun main(args:Array<String>) {
    val baearianGreeter = Greeter("Servus")
    baearianGreeter("Dmitry")
}