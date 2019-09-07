package com.yangd.kotlininaction_2.VII.III

import android.os.Build
import android.support.annotation.RequiresApi
import com.yangd.kotlininaction_2.VII.II.Point
import java.time.LocalDate

data class Rectangle(
    val upperLeft: Point,
    val lowerRight: Point
)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5, 5) in rect)

    val now  = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)

    val n = 9
    println(0..(n+1))

    (0..n).forEach{
        print(it)
    }
}

