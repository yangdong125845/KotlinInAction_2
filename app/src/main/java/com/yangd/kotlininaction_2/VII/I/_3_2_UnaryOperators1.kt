package com.yangd.kotlininaction_2.VII.I

import java.math.BigDecimal

operator fun BigDecimal.inc() = this +BigDecimal.ONE

fun main(args:Array<String>) {
    var bd = BigDecimal.ZERO
    println(bd++)

    println(++bd)
}