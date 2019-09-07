package com.yangd.kotlininaction_2.II.II

import java.util.*

class Rectangle1(val height:Int,val width:Int) {
    val isSquare:Boolean
     get() =height==width
}

fun createRandomRedtangle() :Rectangle {
    val random = Random();
    return Rectangle(random.nextInt(),random.nextInt())
}

