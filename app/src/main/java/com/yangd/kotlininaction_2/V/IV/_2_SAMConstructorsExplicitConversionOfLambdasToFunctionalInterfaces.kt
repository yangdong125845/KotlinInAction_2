package com.yangd.kotlininaction_2.V.IV

import android.view.View
import com.yangd.kotlininaction_2.R

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()

//    val listener = View.OnClickListener {
//        view ->
//        val text = when(view.id) {
//            R.id.button1 ->"First button"
//            R.id.button2 -> "Second button"
//            else ->"Unknown button"
//        }
//        println(text)
//    }
//
//    button1.setOnCLickListener(listener)
//    button2.setOnClickListener(listener)


}