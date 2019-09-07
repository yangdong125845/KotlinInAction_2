package com.yangd.kotlininaction_2.V.V

import android.content.Context
import android.widget.TextView
import java.lang.StringBuilder

fun alphabet3() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alpahbet!")
}.toString()

fun alphabet4() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun createViewWihtCustomAttributes(context: Context) =
    TextView(context).apply {
        text = "Sample Text"
        textSize = 20.0F
        setPadding(10, 0, 0, 0)
    }

fun main(args: Array<String>) {
    println(alphabet3())
}