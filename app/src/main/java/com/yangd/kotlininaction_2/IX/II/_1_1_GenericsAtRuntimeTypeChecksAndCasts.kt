package com.yangd.kotlininaction_2.IX.II

import java.lang.IllegalArgumentException

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun main(args: Array<String>) {
    printSum(listOf(1, 2, 3))
   printSum(setOf(1, 2, 3))
    printSum(listOf("a", "b", "c"))
}
