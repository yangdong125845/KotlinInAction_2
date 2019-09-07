package com.yangd.kotlininaction_2.V.I

fun main(args:Array<String>) {
    val sum = { x:Int,y:Int ->
        println("Computing the sum of $x and $y...")
        x+y
    }

    println(sum(1,2))



}