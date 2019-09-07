package com.yangd.kotlininaction_2.VI.I

fun strLen(s: String) = s.length
//Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//fun strLenSafe(s:String?) = s.length

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

fun main(args: Array<String>) {

    //strLen(null)  //Null can not be a value of a non-null type String
    val x: String? = null
    //val y:String = x  //Type mismatch.Required:String Found:String?
    //strLen(x) ////Type mismatch.Required:String Found:String?
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}