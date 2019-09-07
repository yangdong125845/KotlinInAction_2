package com.yangd.kotlininaction_2.IV.II

open class User3(val nickname:String) {}

class TwitterUser(nickname: String) :User3(nickname){

}

open class Button

class RadioButton:Button()

class OneButton(text:String) :Button()

class Secretive private constructor(){}