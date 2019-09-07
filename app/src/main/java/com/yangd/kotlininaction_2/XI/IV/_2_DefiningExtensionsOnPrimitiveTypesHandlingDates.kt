package com.yangd.kotlininaction_2.XI.IV

import android.annotation.TargetApi
import android.os.Build
import android.support.annotation.RequiresApi
import java.time.LocalDate
import java.time.Period

val Int.days: Period
    @RequiresApi(Build.VERSION_CODES.O)
    get() = Period.ofDays(this)

val Period.ago: LocalDate
    @TargetApi(Build.VERSION_CODES.O)
    get() = LocalDate.now() - this

val Period.fromNow: LocalDate
    @TargetApi(Build.VERSION_CODES.O)
    get() = LocalDate.now() + this

fun main(args: Array<String>) {
    println(1.days.ago)
    println(1.days.fromNow)
}

