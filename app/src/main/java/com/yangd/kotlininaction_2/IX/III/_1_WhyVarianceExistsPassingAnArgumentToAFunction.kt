package com.yangd.kotlininaction_2.IX.III

fun printCountents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list:MutableList<Any>) {
    list.add(42)
}

fun addAnswer1(list:List<Any>) {
    list.get(0)
}

interface Producer<out T> {
    fun produce() :T
}

fun main(args:Array<String>) {
    printCountents(listOf("abc", "bac"))

    val strings = mutableListOf("abc","bac")
//    addAnswer(strings)
    addAnswer1(strings)

}