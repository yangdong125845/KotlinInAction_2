package com.yangd.kotlininaction_2.III.II

import java.lang.StringBuilder

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args:Array<String>) {
    val list = listOf(1,2,3)
    println(joinToString(list,";","(",")"))
}