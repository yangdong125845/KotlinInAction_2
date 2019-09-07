package com.yangd.kotlininaction_2.IX.II

//fun <T> isA(value:Any) = value is T  //Cannot check for instance of erased type: T

inline fun <reified  T> isA(value:Any) = value is T

fun main(args:Array<String>) {
    println(isA<String>("abc"))
    println(isA<String>(124))
}