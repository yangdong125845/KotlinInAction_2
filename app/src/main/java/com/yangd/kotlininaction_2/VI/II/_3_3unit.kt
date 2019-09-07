package com.yangd.kotlininaction_2.VI.II


fun f(): Unit {

}

fun f1() {

}

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        // do stuff
    }
}

fun main(args: Array<String>) {

}