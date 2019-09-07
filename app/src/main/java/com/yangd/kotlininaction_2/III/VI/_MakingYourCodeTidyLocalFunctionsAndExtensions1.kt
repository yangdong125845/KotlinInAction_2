package com.yangd.kotlininaction_2.III.VI

import java.lang.IllegalArgumentException

class User1(val id: Int, val name: String, val address: String)

fun saveUser1(user: User1) {
    fun validate(
        user: User1,
        value: String,
        fieldName: String
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(user,user.name,"Name")
    validate(user,user.address,"Address")
}


fun main(args:Array<String>) {
    println(saveUser1(User1(1,"","")))
}
