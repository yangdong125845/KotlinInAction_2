package com.yangd.kotlininaction_2.IV.I

import java.io.Serializable

interface  State:Serializable

interface  View {
    fun getCurrentState() :State
    fun restoreState(state:State) {}
}