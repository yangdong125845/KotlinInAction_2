package com.yangd.kotlininaction_2.VIII.II

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bobo", 31))

fun main(args: Array<String>) {
    println(people.filter {
        it.age < 30 }
    )
}