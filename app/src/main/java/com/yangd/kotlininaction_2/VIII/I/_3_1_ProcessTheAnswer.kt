@file:JvmName("ProcessTheAnswer")
package com.yangd.kotlininaction_2.VIII.I

fun processTheAnswer(f:(Int) -> Int) {
    println(f(42))
}