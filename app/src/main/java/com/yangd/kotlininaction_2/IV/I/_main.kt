package com.yangd.kotlininaction_2.IV.I

interface Clickable1 {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b:Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

class  Button1 :Clickable1,Focusable {

    override fun showOff() {
        super<Clickable1>.showOff()
        super<Focusable>.showOff()
    }

    override fun click()  = println("I was clicked")
}

fun main(args :Array<String>) {
    val button = Button1()
    button.showOff()
    button.setFocus(true)
    button.click()
}