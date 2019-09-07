package com.yangd.kotlininaction_2.V.III

import com.yangd.kotlininaction_2.V.II.Person

fun main(args: Array<String>) {
    val people = listOf(
        Person("Jack", 29), Person("Aom", 12),
        Person("Att", 25)
    )
    println(people.map(Person::name).filter { it.startsWith("A") })

    val list = people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList()
    println(list)

    listOf(1, 2, 3, 4)
        .map { print("map($it)  ");it * it }
        .filter { print("filter($it)  ");it % 2 == 0 }
    println()

    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it)  ");it * it }
        .filter { print("filter($it)  ");it % 2 == 0 }

    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it)  ");it * it }
        .filter { print("filter($it)  ");it % 2 == 0 }
        .toList()

    println(listOf(1, 2, 3, 4).asSequence()
        .map { it * it }.find { it > 3 })

    val peopleList = listOf(
        Person("Alice", 29),
        Person("Bob", 31), Person("Charles", 31),
        Person("Dan", 21)
    )
    println(
        peopleList.asSequence().map(Person::name)
            .filter { it.length < 4 }.toList()
    )

    println(peopleList.asSequence().filter { it.name.length < 4 }
        .map(Person::name).toList())
}