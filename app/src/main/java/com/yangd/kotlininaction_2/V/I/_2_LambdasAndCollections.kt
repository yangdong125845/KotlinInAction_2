package com.yangd.kotlininaction_2.V.I

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 29), Person("Bob", 31)
    )
    findTheOldest(people)

    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))
    println(people.maxBy({ p: Person -> p.age }))
    println(people.maxBy() { p: Person -> p.age })
    println(people.maxBy { p: Person -> p.age })
}
