package com.yangd.kotlininaction_2.IV.I

class Outer {

    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}