package com.yangd.kotlininaction_2.VII.I

operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

fun main(args: Array<String>) {
    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])
}