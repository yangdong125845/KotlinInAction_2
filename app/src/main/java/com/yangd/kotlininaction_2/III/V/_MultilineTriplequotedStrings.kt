package com.yangd.kotlininaction_2.III.V

val kotlinLogo = """| //
        .|//
        .|/ \"""

fun main(args:Array<String>) {
    println(kotlinLogo.trimMargin("."))
    println("""$ {'$'} 99.9""")
}