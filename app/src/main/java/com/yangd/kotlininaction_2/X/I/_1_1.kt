package com.yangd.kotlininaction_2.X.I

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {

}

const val TEST_TIMEOUT = 100L

//@Test(timeout = TEST_TIMEOUT)
//fun testMethod() {
//
//}

fun test(list:List<*>) {
    @Suppress("UNCHECKED_CAST")
    val strings = list as List<String>
}

fun main(args: Array<String>) {
    remove(1)
}