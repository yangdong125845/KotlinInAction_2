package com.yangd.kotlininaction_2.II.V

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber2(reader:BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch (e:NumberFormatException) {
        null
    }

    println(number)
}

fun main(args:Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber2(reader)
}