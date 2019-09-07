package com.yangd.kotlininaction_2.VII.V

class Person7{
    private val _attributes = hashMapOf<String,String>()

    fun setAttribute(attrName:String,value:String) {
        _attributes[attrName] = value
    }

    val name:String by _attributes
}


fun main(args: Array<String>) {
    val p = Person7()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)
    println(p.name)
}