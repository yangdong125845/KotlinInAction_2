package com.yangd.kotlininaction_2.V.II

fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 31),
        Person("Bob", 29), Person("Carol", 31),
        Person("Jack", 18)
    )
    println(people.groupBy { it.age })

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))

}