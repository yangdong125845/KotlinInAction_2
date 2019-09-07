package com.yangd.kotlininaction_2.VII.IV

fun splitFilename1(fullName:String) :NameComponents {
    val (name,extension) = fullName.split('.',limit = 2)
    return NameComponents(name,extension)
}