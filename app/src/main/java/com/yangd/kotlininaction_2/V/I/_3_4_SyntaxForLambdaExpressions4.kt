package com.yangd.kotlininaction_2.V.I

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

    run { println(42) }
}