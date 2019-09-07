package com.yangd.kotlininaction_2.IV.II

class User6(val name:String) {
    var address :String = "unspecified"
    set(value:String) {
        println("""Address was changed for $name :
            "$field" ->"$value".
        """.trimIndent())
        field = value
    }
}

fun main(args:Array<String>) {
    val user = User6("Alice")
    user.address = "Elsenheimerestrasse 47, 80687 Muenchen"
}