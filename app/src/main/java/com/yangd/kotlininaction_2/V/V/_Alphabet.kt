package com.yangd.kotlininaction_2.V.V

import java.lang.StringBuilder

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun main(args:Array<String>) {
    println(alphabet())
}