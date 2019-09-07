package com.yangd.kotlininaction_2.III.VI

import java.lang.IllegalArgumentException

class User2(val id:Int,val name:String,val address:String)

fun saveUser2(user:User2) {
    fun validate(value:String,fieldName:String ) {
        if(value.isEmpty()) {
            throw  IllegalArgumentException(
                "Can't save user ${user.id} : empty $fieldName"
            )
        }
    }
    validate(user.name,"Name")
    validate(user.address,"Address")
}

fun main(args:Array<String>) {
    saveUser2(User2(1,"",""))
}