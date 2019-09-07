package com.yangd.kotlininaction_2.VI.II

fun foo(l:Long) = println(l)

fun main(args:Array<String>) {
    val b:Byte = 1
    val l = b+1L
    foo(42)
    val v = 1L +1.0f
    println(v)
    println("42".toInt())
    val answer:Any = 42
}