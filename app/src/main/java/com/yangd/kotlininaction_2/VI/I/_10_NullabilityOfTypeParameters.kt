package com.yangd.kotlininaction_2.VI.I

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}
fun <T:Any> printHashCode1(t:T) {
    println(t.hashCode())
}

fun main(args: Array<String>) {
    printHashCode(null)
//    printHashCode1(null)  //Error
    //
}