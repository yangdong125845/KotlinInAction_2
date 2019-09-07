package com.yangd.kotlininaction_2.VI.II

import java.lang.IllegalStateException


fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main(args: Array<String>) {
    fail("Error occurred")
}