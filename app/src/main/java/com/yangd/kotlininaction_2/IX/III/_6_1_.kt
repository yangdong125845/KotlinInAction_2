package com.yangd.kotlininaction_2.IX.III

import java.util.*


fun main(args: Array<String>) {
    val list: MutableList<Any?> = mutableListOf("a", 1, "qwe")
    val chars = mutableListOf("a", "b", "c")
    val unknownElements: MutableList<*> =
        if (Random().nextBoolean()) list else chars
   // unknownElements.add(42)
    //Out-projected type 'MutableList<*>' prohibits the use of 'public abstract fun add(element: E): Boolean defined in kotlin.collections.MutableList'
    println(unknownElements.first())
}