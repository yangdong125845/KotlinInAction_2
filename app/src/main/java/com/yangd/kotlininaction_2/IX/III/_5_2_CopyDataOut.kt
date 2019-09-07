package com.yangd.kotlininaction_2.IX.III

fun <T> copyData2(source:MutableList<out T>,
                  destionation:MutableList<T>) {
    for (item in source){
        destionation.add(item)
    }
}

fun main(args:Array<String>) {
    val ints = mutableListOf(1,2,3)
    val anyItems = mutableListOf<Any>()
    copyData2(ints,anyItems)
    println(anyItems)

    val list:MutableList<out Number>  = mutableListOf(1,2,3)
//    list.add(42)
}