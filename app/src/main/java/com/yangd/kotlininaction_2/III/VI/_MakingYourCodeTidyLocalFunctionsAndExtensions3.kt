package com.yangd.kotlininaction_2.III.VI

import java.lang.IllegalArgumentException

class User3(val id:Int,val name:String,val address:String)

fun User3.validateBeforeSave() {
    fun validate(value:String,fieldName:String) {
        if(value.isEmpty()) {
            throw  IllegalArgumentException(
                "Can't save user $id :empty $fieldName"
            )
        }
    }

    validate(name,"Name")
    validate(address,"Address")
}

fun saveUser3(user:User3) {
    user.validateBeforeSave()
}