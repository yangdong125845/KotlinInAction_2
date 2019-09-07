package com.yangd.kotlininaction_2.III.III

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button")

fun main(args:Array<String>) {
    val view:View = Button()
    view.showOff()
}