package com.yangd.kotlininaction_2.V.II

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args:Array<String>) {
    val people = listOf(
        Person("Alice",27), Person("Bob",31),Person("bbb",28)
    )
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(!people.all(canBeInClub27))
    println(!people.any(canBeInClub27))
}