package com.yangd.kotlininaction_2.VIII.III

import java.lang.StringBuilder

fun main(args: Array<String>) {
    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
}