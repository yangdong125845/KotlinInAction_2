package com.yangd.kotlininaction_2.VII.V

class Person6 {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    var name: String
        get() = _attributes["name"]!!
    set(value) {
        _attributes["name"] = value
    }
}

fun main(args: Array<String>) {
    val p = Person6()
    val data = mapOf(
        "name" to "Dmitry", "company" to "JetBrains")

    for ((attrName,value) in data) {
        p.setAttribute(attrName,value)
    }
    println(p.name)
    p.name = "Tom"
    println(p.name)

}