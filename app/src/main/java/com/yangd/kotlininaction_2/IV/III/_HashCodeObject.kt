package com.yangd.kotlininaction_2.IV.III

class Client3(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client3) {
            return false
        }
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun toString(): String =
        "Client(name=$name,postalCode = $postalCode)"

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main(args: Array<String>) {
    val processed = hashSetOf(Client3("Alice", 342562))
    println(processed.contains(Client3("Alice", 342562)))

    val client1 = Client2("Alice", 342562)
    val client2 = Client2("Alice", 342562)
    println(client1 == client2)
}