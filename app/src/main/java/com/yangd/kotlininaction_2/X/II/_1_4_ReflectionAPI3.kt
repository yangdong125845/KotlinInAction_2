package com.yangd.kotlininaction_2.X.II

class Person1(val name:String,val age:Int)

fun main(args:Array<String>) {
    val person = Person1("Alice",29)
    val memberProperty = Person1::age
    println(memberProperty.get(person))
}