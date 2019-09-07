package com.yangd.kotlininaction_2.IX.III

fun <T> copyData(source:MutableList<T>,
                 destination:MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}