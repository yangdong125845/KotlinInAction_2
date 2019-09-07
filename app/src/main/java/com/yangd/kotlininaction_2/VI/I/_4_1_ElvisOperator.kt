package com.yangd.kotlininaction_2.VI.I

fun foo(s: String?) {
    val t: String = s ?: ""
}

fun strLenSafe1(s: String?): Int = s?.length ?: 0

fun main(args: Array<String>) {
    println(strLenSafe1("abc"))
    println(strLenSafe1(null))
}