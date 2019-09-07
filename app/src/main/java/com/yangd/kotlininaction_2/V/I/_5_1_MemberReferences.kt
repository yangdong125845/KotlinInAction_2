package com.yangd.kotlininaction_2.V.I

fun salute() = println("Salute!")

fun main(args:Array<String>) {
    val getAge = Person::age
    val getAge1 = {person:Person ->person.age}
    run(::salute)


}