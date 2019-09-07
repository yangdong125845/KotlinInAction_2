package com.yangd.kotlininaction_2.IX.III

fun printFirst(list: List<*>) {
    if(list.isNotEmpty()) {
        println(list.first())
    }
}

fun <T> printFirst1(list:List<T>) {
    if(list.isNotEmpty()) {
        println(list.first())
    }
}

fun main(args:Array<String>) {
    printFirst(listOf("Svelana","Dmitry"))
    printFirst1(listOf("Svelana","Dmitry"))
}