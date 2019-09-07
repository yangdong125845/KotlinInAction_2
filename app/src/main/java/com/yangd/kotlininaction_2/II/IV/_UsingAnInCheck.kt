package com.yangd.kotlininaction_2.II.IV


fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c:Char) = c !in '0'..'9'

fun main(args:Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('x'))
}
