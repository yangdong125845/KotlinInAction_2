package com.yangd.kotlininaction_2.IX.II

fun printSum1(c:Collection<Int>) {
    if( c is List<Int>) {
        println(c.sum())
    }
}

fun main(args:Array<String>) {
    printSum1(listOf(1,2,3))
    //printSum1(listOf("a","b","c")) Error:Type inference failed. Expected type mismatch:
    //required:
    //Collection<Int>
    //found:
    //List<String>
}