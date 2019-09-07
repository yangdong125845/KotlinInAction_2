package com.yangd.kotlininaction_2.IV.IV

class A {
   companion object{
       fun bar() {
           println("Companion object called")
       }
   }
}

fun main(args:Array<String>) {
    println(A.bar())
}