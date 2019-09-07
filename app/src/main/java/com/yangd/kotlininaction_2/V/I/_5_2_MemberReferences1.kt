package com.yangd.kotlininaction_2.V.I

data class Person1(val name: String, val age: Int)


fun main(args: Array<String>) {
    val createPerson = ::Person1
    val p = createPerson("Alice", 29)
    println(p)
    val predicate =Person1::isAdult
    println(predicate(p))
    println(p.isAdult())

    val pp = Person1("Dmitry",34)
    val personAgeFunction = Person1::age
    println(personAgeFunction(pp))

    val dmitrysAgeFunction = pp::age
    println(dmitrysAgeFunction())
}

fun Person1.isAdult() = age >= 21