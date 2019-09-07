package com.yangd.kotlininaction_2.II.III

import com.yangd.kotlininaction_2.II.III.Color.*
import java.lang.Exception

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    print(mix(BLUE, VIOLET))
}