package com.yangd.kotlininaction_2.X.II

var counter = 0

fun main(args:Array<String>) {
    val kProperty = ::counter
    kProperty.setter.call(21)
    println(kProperty.get())
}