package com.yangd.kotlininaction_2.VI.II

fun main(args: Array<String>) {
    val i = 1
    val l: Long = i.toLong()
    val list = listOf(1L,2L,3L)
    println(i.toLong() in listOf(1L,2L,3L))
}