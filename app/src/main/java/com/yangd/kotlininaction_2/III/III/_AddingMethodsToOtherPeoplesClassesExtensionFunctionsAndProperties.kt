package com.yangd.kotlininaction_2.III.III

fun String.lastChar():Char = this.get(this.length -1)

fun main(args:Array<String>) {
    println("Kotlin".lastChar())
}