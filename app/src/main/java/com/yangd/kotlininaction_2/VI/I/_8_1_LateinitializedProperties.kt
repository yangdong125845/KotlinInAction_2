package com.yangd.kotlininaction_2.VI.I

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

}