package com.yangd.kotlininaction_2.II.III
import com.yangd.kotlininaction_2.II.III.Color.*

fun getWarmth1(color: Color) = when(color) {
    RED,ORANGE,YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE,INDIGO,VIOLET ->"cold"
}

fun main(args:Array<String>) {
    println(getWarmth1(GREEN))
}