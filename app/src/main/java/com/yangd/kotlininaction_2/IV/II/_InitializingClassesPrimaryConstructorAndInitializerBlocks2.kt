package com.yangd.kotlininaction_2.IV.II

class User2(val nickname:String,
            val isSubscribed:Boolean = true)

fun main(args:Array<String>) {
    val alice = User2("Alice")
    println(alice.isSubscribed)
    val bob = User2("Bob",false)
    println(bob.isSubscribed)
    val carol = User2("Carol",isSubscribed = false)
    println(carol.isSubscribed)
}