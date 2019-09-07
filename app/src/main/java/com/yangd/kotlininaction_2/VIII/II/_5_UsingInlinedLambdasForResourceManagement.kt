package com.yangd.kotlininaction_2.VIII.II

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLineFromFile(path:String) :String {
    BufferedReader(FileReader(path)).use {
        br ->
        return br.readLine()
    }
}