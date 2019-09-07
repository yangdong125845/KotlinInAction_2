package com.yangd.kotlininaction_2.II.IV

fun recognize(c:Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z' ,in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}

fun main(args:Array<String>) {
    println(recognize('8'))

    println("Kotlin" in "Java".."Scala")

    println("Kotlin" in setOf("Java","Scala"))
}