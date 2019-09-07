package com.yangd.kotlininaction_2.IX.III

import kotlin.reflect.KClass

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}

fun main(args: Array<String>) {
    val validators =
        mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator
    //validators[String::class]!!.validate("")
    //Out-projected type 'FieldValidator<*>' prohibits the use of 'public abstract fun validate(input: T): Boolean
    // defined in com.yangd.kotlininaction_2.IX.III.FieldValidator'

    val stringValidator = validators[String::class]
                                                       as FieldValidator<String>
    println(stringValidator.validate(""))

    val stringValidator1 = validators[Int::class]
                                                   as FieldValidator<String>
    stringValidator1.validate("")
}