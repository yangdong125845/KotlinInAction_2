package com.yangd.kotlininaction_2.VIII.I

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()

fun main(args: Array<String>) {
    println(log.averageDurationFor { it.os in setOf(OS.ANDROID, OS.IOS) })

    println(log.averageDurationFor { it.os == OS.IOS && it.path == "/signup" })
}