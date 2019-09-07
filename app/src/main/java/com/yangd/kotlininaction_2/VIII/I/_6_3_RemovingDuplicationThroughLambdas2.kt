package com.yangd.kotlininaction_2.VIII.I

val averageMobileDuration1 = log
    .filter { it.os in setOf(OS.IOS,OS.ANDROID) }
    .map(SiteVisit::duration)
    .average()

fun main(args:Array<String>) {
    println(averageMobileDuration1)
}