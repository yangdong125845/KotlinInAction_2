package com.yangd.kotlininaction_2.VII.III

import com.yangd.kotlininaction_2.VII.II.Point
import java.lang.IndexOutOfBoundsException

operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main(args:Array<String>) {
    val p = Point(10,20)
    println(p[1])
}