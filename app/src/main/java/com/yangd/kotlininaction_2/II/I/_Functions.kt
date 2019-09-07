package com.yangd.kotlininaction_2.II.I

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max1(a: Int, b: Int): Int = if (a > b) a else b

fun max2(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println(max(1, 2))
}
