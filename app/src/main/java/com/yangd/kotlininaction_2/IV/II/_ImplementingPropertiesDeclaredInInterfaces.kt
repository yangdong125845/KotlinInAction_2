package com.yangd.kotlininaction_2.IV.II

interface User4 {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User4


class SubscribingUser(val email: String) : User4 {

    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User4 {
    override val nickname = getFacebookName(accountId)
}

fun getFacebookName(accountId: Int): String {
    return "facebook"
}

fun main(args:Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)

    println(SubscribingUser("test@kotlinlang.org").nickname)
}