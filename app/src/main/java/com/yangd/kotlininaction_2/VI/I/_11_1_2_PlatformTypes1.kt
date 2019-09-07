package com.yangd.kotlininaction_2.VI.I

fun yellAt(person5: Person5) {
    println(person5.name.toUpperCase() + "!!!")
}

fun yellAtSafe(person5: Person5) {
    println((person5.name ?: "Anyone").toUpperCase() + "!!!")
}

fun main(args: Array<String>) {
//    yellAt(Person5(null))
    //Exception in thread "main" java.lang.IllegalStateException: person5.name must not be null
    yellAtSafe(Person5(null))
}