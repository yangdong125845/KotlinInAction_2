package com.yangd.kotlininaction_2.VI.II

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}% done!")
}

fun main(args: Array<String>) {
    showProgress(146)
    showProgress(98)
    val i: Int = 1
    val list: List<Int> = listOf(1, 2, 3)
}