package com.yangd.kotlininaction_2.IX.III


fun main(args: Array<String>) {
    val anyComparator = Comparator<Any> { e1, e2 ->
        e1.hashCode() - e2.hashCode()
    }

    val strings: List<String> = listOf("a", "b")
    strings.sortedWith(anyComparator)

}