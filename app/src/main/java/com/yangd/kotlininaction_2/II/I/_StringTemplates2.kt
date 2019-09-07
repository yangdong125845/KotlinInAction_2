package com.yangd.kotlininaction_2.II.I

fun main(args: Array<String>) {
    println("Hello,${if (args.size > 0) args[0] else "someone"}!")
}