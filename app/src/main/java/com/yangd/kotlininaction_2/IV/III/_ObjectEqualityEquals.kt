package com.yangd.kotlininaction_2.IV.III

class Client1(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client1 = Client1("Alice", 342562)
    val client2 = Client1("Alice", 342562)
    println(client1 == client2)
}