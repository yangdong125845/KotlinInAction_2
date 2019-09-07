package com.yangd.kotlininaction_2.VI.III

fun main(args: Array<String>) {
    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)

    val squares = IntArray(5) { i ->
        (i + 1) * (i + 1)
    }
    println(squares.joinToString())

    args.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}