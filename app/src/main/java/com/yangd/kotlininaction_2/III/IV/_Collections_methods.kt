package com.yangd.kotlininaction_2.III.IV


fun main(args:Array<String>) {
    val strings:List<String>  = listOf("first","second","fourteenth")
    println(strings.last())

    val numbers:Collection<Int> = setOf(1,14,2)
    println(numbers.max())
}
