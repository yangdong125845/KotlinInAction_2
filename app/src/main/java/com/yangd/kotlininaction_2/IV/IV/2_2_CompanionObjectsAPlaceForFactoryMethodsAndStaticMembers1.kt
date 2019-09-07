package com.yangd.kotlininaction_2.IV.IV

import com.yangd.kotlininaction_2.IV.II.getFacebookName

class User{
    val nickname:String
    constructor(email:String) {
        nickname = email.substringBefore("2")
    }

    constructor(facebookAccountId:Int) {
        nickname = getFacebookName(facebookAccountId)
    }
}

class User1 private constructor(val nickname:String) {
    companion object {
        fun newSubscribingUser(email: String) =
                User1(email.substringBefore("@"))

        fun newFacebookUser(accountId:Int) =
                User1(getFacebookName(accountId))
    }
}

fun main(args:Array<String>) {
    val subscribingUser = User1.newSubscribingUser("bob@gmail.com")
    val facebookUser = User1.newFacebookUser(4)
      println(subscribingUser.nickname)
}
