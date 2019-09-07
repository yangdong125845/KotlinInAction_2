package com.yangd.kotlininaction_2.VII.I

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(p * 1.5)
}