package com.yangd.kotlininaction_2.VI.I

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun String?.isNullOrBlank(): Boolean =
    this == null || this.isBlank()

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
//    val person: String? = "a"
//    person.let {
//        sendEmailTo(it)
//    }

}