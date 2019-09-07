package com.yangd.kotlininaction_2.X.II

fun foo(x: Int) = println(x)

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    val kFunction = ::foo
    kFunction.call(42)

    val kFunction2 = ::sum
    println(kFunction2.invoke(1, 2) + kFunction2(3, 4))
//    kFunction2(1)
}