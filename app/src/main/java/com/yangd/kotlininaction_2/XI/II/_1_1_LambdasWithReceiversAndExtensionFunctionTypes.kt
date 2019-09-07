package com.yangd.kotlininaction_2.XI.II

import java.lang.StringBuilder

fun buildString(
    builderAction: (StringBuilder) -> Unit
): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun main(args:Array<String>) {
    val s = buildString {
        it.append("Hello, ")
        it.append("World!")
    }

    println(s)
}