package com.yangd.kotlininaction_2.VIII.I

import java.lang.StringBuilder

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    println("ab1c".filter {
        it in 'a'..'z' })
}