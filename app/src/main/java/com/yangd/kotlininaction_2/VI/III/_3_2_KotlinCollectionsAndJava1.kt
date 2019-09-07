package com.yangd.kotlininaction_2.VI.III

fun printlnUppercase(list:List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main(args:Array<String>) {
    val list = listOf("a","b","c")
    printlnUppercase(list)
}