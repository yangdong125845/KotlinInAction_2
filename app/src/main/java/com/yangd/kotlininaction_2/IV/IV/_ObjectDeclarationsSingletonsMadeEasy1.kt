package com.yangd.kotlininaction_2.IV.IV

data class Person(val name:String) {
    object NameComparator:Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int =
                p1.name.compareTo(p2.name)
    }
}

fun main(args:Array<String>) {
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}