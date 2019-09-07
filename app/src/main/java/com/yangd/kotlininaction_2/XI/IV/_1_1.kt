package com.yangd.kotlininaction_2.XI.IV

import android.service.autofill.FieldClassification
import java.io.StringWriter
import java.lang.AssertionError

interface Matcher<T> {
    fun test(value: T)
}

infix fun <T> T.should(matcher: Matcher<T>) = matcher.test(this)

class startWith(val prefix: String) : Matcher<String> {
    override fun test(value: String) {
        if (!value.startsWith(prefix)) {
            throw AssertionError("String  $value does not start with $prefix")
        }
    }
}

object start

infix fun String.should(x: start): StartWrapper = StartWrapper(this)

class StartWrapper(val value: String) {
    infix fun with(prefix: String) {
        if (!value.startsWith(prefix))
            throw AssertionError(
                "String does not start with $prefix: $value"
            )


    }

}

fun main(args: Array<String>) {

//    "k" should startWith("kot")
//    "kotlin".should(start).with("kot")

    "kotlin" should start with "kot"
}