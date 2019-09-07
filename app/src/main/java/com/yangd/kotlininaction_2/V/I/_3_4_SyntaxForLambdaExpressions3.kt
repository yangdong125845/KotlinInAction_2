package com.yangd.kotlininaction_2.V.I

fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 29), Person("Bob", 31)
    )
    val names = people.joinToString(separator = " ",
        transform = { p: Person -> p.name })
    val namess = people.joinToString(" ") { p: Person -> p.name }
    val namesss = people.joinToString(" ") { p -> p.name }
    val namessss = people.joinToString(" ") { it.name }
    println(names)
    println(namess)
    println(namesss)
    println(namessss)

    //val getAge = { p-> p.age }
    // Error: Cannot infer a type for this parameter. Please specify it explicitly

}