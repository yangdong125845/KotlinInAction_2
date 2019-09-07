package com.yangd.kotlininaction_2.VII.III

import android.os.Build
import android.support.annotation.RequiresApi
import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator() : Iterator<LocalDate> =
        object :Iterator<LocalDate> {
            var current = start

            override fun hasNext() =
                    current <=endInclusive

            @RequiresApi(Build.VERSION_CODES.O)
            override fun next()= current.apply {
                current = plusDays(1)
            }
        }

@RequiresApi(Build.VERSION_CODES.O)
fun main(args:Array<String>) {
    val newYear = LocalDate.ofYearDay(2017,1)
    val daysOff = newYear.minusDays(1)..newYear

    for(dayOff in daysOff) {
        println(dayOff)
    }
}