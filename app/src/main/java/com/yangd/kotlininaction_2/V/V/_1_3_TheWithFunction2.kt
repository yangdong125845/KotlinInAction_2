package com.yangd.kotlininaction_2.V.V

fun alphabet2() = with(StringBuffer()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}
fun main(args:Array<String>) {
    println(alphabet2())
}