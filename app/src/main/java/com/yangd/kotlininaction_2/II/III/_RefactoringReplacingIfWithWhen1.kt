package com.yangd.kotlininaction_2.II.III

fun eval2(e:Expr):Int =
        when(e) {
            is Num ->
                e.value
            is Sum ->
                eval(e.right) + eval(e.left)
            else ->
                throw IllegalArgumentException("Unknown expression")
        }

fun main(args:Array<String>) {
    println(eval1(Sum(Sum(Num(1),Num(2)),Num(4))))
}