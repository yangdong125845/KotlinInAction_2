package com.yangd.kotlininaction_2.III.V

fun parsePath1(path:String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult!=null) {
        val (directory,filename,extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main(args:Array<String>) {
    parsePath1("C:/Users/yangdong/Desktop/Study/Kotlin实战@www.java1234.com.pdf")
}