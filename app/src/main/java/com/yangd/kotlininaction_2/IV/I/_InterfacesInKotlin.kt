package com.yangd.kotlininaction_2.IV.I

interface Clickable {
    fun click()
}

class Button :Clickable {
    override fun click() = println("I was clicked")
}

fun main(args:Array<String>) {
    Button().click()
}