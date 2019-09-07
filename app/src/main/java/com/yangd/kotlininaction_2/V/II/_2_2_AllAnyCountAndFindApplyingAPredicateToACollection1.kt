package com.yangd.kotlininaction_2.V.II

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3 })

    val people = listOf(
        Person("Alice",27),Person("Bob",31),Person("Jack",25))

    println(people.count(canBeInClub27))

    println(people.find(canBeInClub27))
}