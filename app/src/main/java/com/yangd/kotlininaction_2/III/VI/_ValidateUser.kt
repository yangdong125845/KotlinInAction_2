package com.yangd.kotlininaction_2.III.VI

import java.lang.IllegalArgumentException

class User(val id:Int,val name:String,val address:String)

fun saveUser(user:User) {
    if(user.name.isEmpty()) {
        throw  IllegalArgumentException(
            "Can't save user ${user.id}: empty Name"
        )
    }

    if(user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Address"
        )
    }
}

fun main(args:Array<String>) {
    println(saveUser(User(1,"","")))
}
