package com.yangd.kotlininaction_2.V.II

fun main(args: Array<String>) {
    val numbers = mapOf(
        0 to "zero", 1 to "one"
    )
    println(numbers.mapValues { it.value.toUpperCase() })
    println(numbers.map { it.value.toUpperCase() })
    println(numbers.mapKeys { it.value.toUpperCase() })
}