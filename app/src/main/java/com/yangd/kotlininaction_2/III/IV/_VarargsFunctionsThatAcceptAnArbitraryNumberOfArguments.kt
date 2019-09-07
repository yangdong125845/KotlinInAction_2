package com.yangd.kotlininaction_2.III.IV

fun main(args:Array<String>) {
    val list = listOf("args: ",*args)
    println(list)

    val map = mapOf(1 to "one",7 to "seven",53 to "fifty-three")
    for ((index,element) in  list.withIndex()){
        println("$index: $element")
    }
}