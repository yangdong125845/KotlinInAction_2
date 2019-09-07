package com.yangd.kotlininaction_2.II.V

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val number = 101
    val percentage =
        if (number in 0..100) {
            number
        } else {
            throw IllegalArgumentException(
                "A percentage value must be between a and 100 :$number"
            )
        }
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))


}