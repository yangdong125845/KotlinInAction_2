package com.yangd.kotlininaction_2.V.III

import java.io.File


fun File.isInsideHiddenDirectory() =
        generateSequence(this) {it.parentFile}.find{it.isHidden}

fun main(args: Array<String>) {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it<=100 }
    println(numbersTo100.sum())

    val file  = File("C:\\Users\\yangdong\\Desktop\\杨东简历.docx")
    println(file.isInsideHiddenDirectory())
    val file1 = File("D:\\WorkSpace\\tinyT.txt")
    println(file1.isInsideHiddenDirectory())
}

