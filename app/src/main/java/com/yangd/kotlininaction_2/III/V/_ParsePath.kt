package com.yangd.kotlininaction_2.III.V

fun parsePath(path:String) {

    val directory  = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory,name: $fileName, ext: $extension")
}

fun main(args:Array<String>) {
    parsePath("C:/Users/yangdong/Desktop/Study/Kotlin实战@www.java1234.com.pdf")
}