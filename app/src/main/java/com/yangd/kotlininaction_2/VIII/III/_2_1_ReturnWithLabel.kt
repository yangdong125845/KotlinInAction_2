package com.yangd.kotlininaction_2.VIII.III

fun lookForAlice2(people:List<Person>) {
    people.forEach label@{
        if(it.name =="Alice") return@label
    }
    println("Alice might be somewhere")
}

fun main(args:Array<String>) {
    lookForAlice2(people)
}