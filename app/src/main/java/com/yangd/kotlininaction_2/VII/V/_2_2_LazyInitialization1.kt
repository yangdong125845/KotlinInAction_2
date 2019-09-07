package com.yangd.kotlininaction_2.VII.V

class Person1(val name:String) {
    val emails by lazy {
        loadEmails(this)
    }
}

fun loadEmails(person: Person1):List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

fun main(args:Array<String>) {
    val p = Person1("Alice")
    p.emails
    p.emails
}