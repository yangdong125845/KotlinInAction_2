package com.yangd.kotlininaction_2.VIII.I

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    val action = { println(42) }

    val sum1: (Int, Int) -> Int = { x, y -> x + y }
    val action1: () -> Unit = { println(42) }
    var canReturnNull: (Int, Int) -> Int? = { _, _ -> null }
    var funOrNull: ((Int, Int) -> Int)? = null

    val url = "http://kotl.in"
    performRequest(url) { code, content -> /***/ }
    performRequest(url) { code, page -> /****/ }
}

fun performRequest(
    url: String,
    callback: (code: Int, content: String) -> Unit
) {
    /****/
}