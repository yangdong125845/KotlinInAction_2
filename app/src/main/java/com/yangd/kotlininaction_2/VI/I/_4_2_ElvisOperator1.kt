package com.yangd.kotlininaction_2.VI.I

import java.lang.IllegalArgumentException

class Address1(
    val streetAddress: String, val zipCode: Int,
    val city: String, val country: String
)

class Company1(val name: String, val address: Address1?)

class Person1(val name: String, val company: Company1?)

fun printShippingLabel(person: Person1) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")

    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main(args: Array<String>) {
    val address = Address1(
        "Elsestr. 47", 80687,
        "Munich", "Germany"
    )
    val jetbrains = Company1("JetBrains", address)
    val person = Person1("Dmity", jetbrains)
    printShippingLabel(person)

    printShippingLabel(Person1("Alexey", null))

}