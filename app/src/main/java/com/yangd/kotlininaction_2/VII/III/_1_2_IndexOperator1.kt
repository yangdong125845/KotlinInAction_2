package com.yangd.kotlininaction_2.VII.III

import java.lang.IndexOutOfBoundsException

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index") as Throwable
    }
}

fun main(args: Array<String>) {
    val p = MutablePoint(10, 20)
    p[1] = 42
    println(p)
}