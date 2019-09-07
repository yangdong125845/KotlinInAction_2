package com.yangd.kotlininaction_2.IX.III

import java.lang.IllegalArgumentException
import kotlin.reflect.KClass

object Validators{
    private val validators =
            mutableMapOf<KClass<*>,FieldValidator<*>>()

    fun <T:Any> registerValidator(
        kClass: KClass<T>,fieldValidator: FieldValidator<T> ){
        validators[kClass] = fieldValidator
    }

    operator fun <T:Any> get(kClass: KClass<T>) :FieldValidator<T> =
            validators[kClass] as? FieldValidator<T>
                ?:throw IllegalArgumentException(
                    "No validator for ${kClass.simpleName}")
}

fun main(args:Array<String>) {
    Validators.registerValidator(String::class,DefaultStringValidator)
    Validators.registerValidator(Int::class,DefaultIntValidator)
   // Validators.registerValidator(String::class,DefaultIntValidator)
    println(Validators[String::class].validate("Kotlin"))
    println(Validators[Int::class].validate(42))
    //println(Validators[String::class].validate(42))
}