package com.yangd.kotlininaction_2.VII.IV

fun printEntries(map: Map<String,String>) {
    for ((key,value) in map) {
        println("$key -> $value")
    }
}

fun main(args:Array<String>) {
    val map = mapOf("Oracle" to "Java",
        "JetBrains" to "Kotlin")
    printEntries(map)

}