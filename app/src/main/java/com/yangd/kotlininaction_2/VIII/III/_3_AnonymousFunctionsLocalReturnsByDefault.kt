package com.yangd.kotlininaction_2.VIII.III

fun lookForAlice4(people: List<Person>) {
    people.forEach(fun(person) {
        if (person.name == "Alice") return
        println("${person.name} is not Alice")
    })
}

fun main(args: Array<String>) {
    lookForAlice4(people)
    people.filter(fun(person): Boolean {
        return person.age < 30
    })
    people.filter(fun(person) = person.age < 30)
}