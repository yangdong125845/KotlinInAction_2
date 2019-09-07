package com.yangd.kotlininaction_2.IX.I

val <T> List<T>.penultimate: T
    get() = this[size - 2]

class a() {
  //  val <T> x:T //Error: Type parameter of a property must be used in its receiver type
}

fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))

    val authors = listOf("Dmitry", "Svetlana")

    val readers = mutableListOf<String>("Dmitry", "Svetlana")
    readers.filter { it !in authors }

    println(listOf(1, 2, 3, 4).penultimate)


}