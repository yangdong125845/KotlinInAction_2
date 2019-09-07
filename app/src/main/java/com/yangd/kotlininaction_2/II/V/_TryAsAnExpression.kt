package com.yangd.kotlininaction_2.II.V

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber1(reader:BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch (e:NumberFormatException) {
        return
    }
    println(number)
}

fun main(args:Array<String>) {
    val reader =BufferedReader(StringReader("not a number"))
    readNumber1(reader)

    val reader1 =BufferedReader(StringReader("1"))
    readNumber1(reader1)
}
