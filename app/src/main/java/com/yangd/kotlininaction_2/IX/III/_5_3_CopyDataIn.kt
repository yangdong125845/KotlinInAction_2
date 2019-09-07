package com.yangd.kotlininaction_2.IX.III

import java.security.CodeSource

fun  <T> copyData3(source: MutableList<T>,
                   destination:MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main(args:Array<String>) {
    val ints = mutableListOf(1,2,3)
    val anyItems = mutableListOf<Any>()
    copyData2(ints,anyItems)
    println(anyItems)

    val list:MutableList<in Number>  = mutableListOf(1,2,3)
    list.add(42)
}