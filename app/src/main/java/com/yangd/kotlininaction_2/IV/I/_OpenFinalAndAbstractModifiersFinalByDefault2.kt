package com.yangd.kotlininaction_2.IV.I

abstract class Animated {

    abstract fun animate()
    open fun stopAnimating() {}
    fun animateTwice() {}
}