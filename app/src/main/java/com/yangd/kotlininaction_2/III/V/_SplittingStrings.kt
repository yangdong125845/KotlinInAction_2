package com.yangd.kotlininaction_2.III.V

fun main(args:Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".","-"))
}