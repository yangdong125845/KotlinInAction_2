package com.yangd.kotlininaction_2.VIII.III

data class Person(val name:String,val age:Int)

val people = listOf(Person("Alice",29),Person("Bob",31))

fun lockForAlice(people:List<Person>) {
    for (person in people) {
        if(person.name=="Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

fun main(args:Array<String>) {
    lockForAlice(people)
}