package com.yangd.kotlininaction_2.V.II

fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 29), Person("Bob", 31)
    )
    println(people.map { it.name })
    println(people.map(Person::name))
    println(people.filter { it.age > 30 }.map(Person::name))
    println(people.filter { it.age == people.maxBy(Person::age)?.age })
    val maxAge = people.maxBy(Person::age)?.age
    people.filter { it.age == maxAge }
}