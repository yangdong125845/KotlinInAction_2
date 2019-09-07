package com.yangd.kotlininaction_2.XI.II

import java.lang.StringBuilder

fun buildString1(
    builderAction:StringBuilder.() -> Unit
):String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

fun main(args:Array<String>) {
    val s=  buildString1 {
        this.append("this Hello, ")
        append("World!")
    }
    println(s)
}