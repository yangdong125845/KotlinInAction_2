package com.yangd.kotlininaction_2.VII.IV

import com.yangd.kotlininaction_2.VII.I.Point


fun main(args:Array<String>) {
    val p = Point(10,20)
    val (x,y) = p
    println(x)
    println(y)
}