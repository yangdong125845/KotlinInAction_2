package com.yangd.kotlininaction_2.X.II

import kotlin.reflect.full.memberProperties

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach{
        println(it.name)
    }
}