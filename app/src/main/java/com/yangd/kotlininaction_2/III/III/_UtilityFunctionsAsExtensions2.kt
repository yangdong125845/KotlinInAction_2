package com.yangd.kotlininaction_2.III.III

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main(args: Array<String>) {
    println(listOf("one", "two", "eight").join(" "))

    //listOf(1,2,8).join() //Error:Type mismatch.
    //Required:
    //Collection<String>
    //Found:
    //List<Int>
}