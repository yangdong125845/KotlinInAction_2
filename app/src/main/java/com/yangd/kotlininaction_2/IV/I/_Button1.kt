package com.yangd.kotlininaction_2.IV.I

import java.io.Serializable

class Button2 :View  {
    override fun getCurrentState(): State  = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }


    class ButtonState:State {

    }


}