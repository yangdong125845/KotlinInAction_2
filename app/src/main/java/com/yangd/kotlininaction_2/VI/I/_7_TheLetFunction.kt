package com.yangd.kotlininaction_2.VI.I

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }

    email?.let { email ->
        sendEmailTo(email)
    }

    email = null
    email?.let {
        sendEmailTo(it)
    }


}