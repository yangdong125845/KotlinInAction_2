package com.yangd.kotlininaction_2.II.II

fun main(args:Array<String>) {
    val person  = Person("Bob",true)
    println(person.name)
    println(person.isMarried)
    person.isMarried =false
    println(person.isMarried)
}