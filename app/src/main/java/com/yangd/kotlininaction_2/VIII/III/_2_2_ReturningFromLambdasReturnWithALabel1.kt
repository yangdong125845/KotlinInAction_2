package com.yangd.kotlininaction_2.VIII.III

fun lookForAlice3(people:List<Person>) {
    people.forEach {
        if(it.name =="Alice") return@forEach
    }

    println("Alice might be somewhere")
}

fun main(args:Array<String>) {
    lookForAlice3(people)
}