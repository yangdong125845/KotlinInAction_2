package com.yangd.kotlininaction_2.VIII.III

fun lockForAlice1(people:List<Person>) {
    people.forEach {
        if(it.name =="Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

fun main(args:Array<String>) {
    lockForAlice1(people)
}