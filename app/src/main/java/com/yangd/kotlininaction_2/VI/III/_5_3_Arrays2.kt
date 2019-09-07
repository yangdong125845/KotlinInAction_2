package com.yangd.kotlininaction_2.VI.III

fun main(args:Array<String>) {
    val strings = listOf("a","b","c","d")
    println("%s/%s/%s".format(*strings.toTypedArray()))
}