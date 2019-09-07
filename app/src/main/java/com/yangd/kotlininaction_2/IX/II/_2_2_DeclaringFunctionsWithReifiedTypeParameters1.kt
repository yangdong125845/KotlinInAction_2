package com.yangd.kotlininaction_2.IX.II

import android.app.Activity
import android.app.Service
import android.content.Context
import android.content.Intent
import java.util.*

fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())

    val serviceImpl = ServiceLoader.load(Service::class.java)
    val serviceImpl1 = loadService<Service>()

}

inline fun <reified T> loadService(): ServiceLoader<T>? {
    return ServiceLoader.load(T::class.java)
}

inline fun <reified T:Activity>
        Context.startActivity() {
    val intent = Intent(this,T::class.java)
    startActivity(intent)
}

inline fun <reified T>
        Iterable<*>.filterIsInstance(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}