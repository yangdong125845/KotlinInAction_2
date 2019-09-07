package com.yangd.kotlininaction_2.IX.III

fun <T:R,R> copyData1(source :MutableList<T>,
                      destination:MutableList<R>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main(args:Array<String>) {
    val ints = mutableListOf(1,2,3)
    val anyItems = mutableListOf<Any>()
    copyData1(ints,anyItems)
    println(anyItems)
}