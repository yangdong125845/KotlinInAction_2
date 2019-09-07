package com.yangd.kotlininaction_2.IX.I

fun <T:Comparable<T>>  max(first:T,second:T) :T {
    return if(first >second) first else second
}

fun main(args:Array<String>) {
    println(max("kotlin","java" ))
//    println(max("kotlin",42))
}