package com.yangd.kotlininaction_2.IV.II

interface User5 {
    val email: String
//    val s ="5"
    val nickname: String
        get() = email.substringBefore('@')
}