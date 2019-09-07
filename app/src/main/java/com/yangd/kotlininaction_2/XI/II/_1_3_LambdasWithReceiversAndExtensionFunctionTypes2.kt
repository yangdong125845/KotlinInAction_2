package com.yangd.kotlininaction_2.XI.II

val appendExc1: StringBuilder.() -> Unit =
    { this.append("!") }

fun buildString2(builderAction: StringBuilder.() -> Unit): String =
    StringBuilder().apply(builderAction).toString()

fun main(args: Array<String>) {
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExc1()
    println(stringBuilder)
    println(buildString(appendExc1))
}