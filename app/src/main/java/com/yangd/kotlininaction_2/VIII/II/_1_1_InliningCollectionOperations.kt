package com.yangd.kotlininaction_2.VIII.II

import java.util.concurrent.locks.Lock

inline fun <T> synchronized(lock: Lock,action:() ->T) :T {
    lock.lock()
    try {
        return action()
    }finally {
        lock.unlock()
    }
}

fun foo(lock: Lock) {
    println("Before sync")
    synchronized(lock) {
        println("Action")
    }
    println("After sync")
}

fun _foo_(lock: Lock) {
    println("Before sync")
    lock.lock()
    try {
        println("Action")
    }finally {
        lock.unlock()
    }
    println("After sync")
}
fun main(args:Array<String>) {
//    val l = Lock()
//    synchronized(l){
//        //...
//    }
}