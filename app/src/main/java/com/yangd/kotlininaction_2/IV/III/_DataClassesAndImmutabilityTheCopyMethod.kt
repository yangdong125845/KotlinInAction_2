package com.yangd.kotlininaction_2.IV.III

data class Client4(val name:String,val postalCode:Int)

fun main(args: Array<String>) {
    val processed = hashSetOf(Client4("Alice", 342562))
    println(processed.contains(Client4("Alice", 342562)))

    val bob = Client4("Bob", 973293)
    println(bob.copy(postalCode = 382555))
}