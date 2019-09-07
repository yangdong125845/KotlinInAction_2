package com.yangd.kotlininaction_2.II.III

fun eval1(e:Expr) :Int =
        if(e is Num)
            e.value
        else if(e is Sum)
            eval(e.right) + eval(e.left)
        else
            throw IllegalArgumentException("Unknown expression")


fun main(args:Array<String>) {
    println(eval1(Sum(Sum(Num(1),Num(2)),Num(4))))
}