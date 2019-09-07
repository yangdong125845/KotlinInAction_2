package com.yangd.kotlininaction_2.IV.II

import android.content.Context
import android.util.AttributeSet

open class View {
    constructor(ctx: Context) {
        //some code
    }

    constructor(ctx: Context, attr: AttributeSet?) {
        //some code
    }
}

class MyButton : View {
    constructor(ctx: Context) : super(ctx) {
        //..
    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        //..
    }
}

class MyButton1 :View {
    constructor(ctx: Context):this(ctx,null) {
        //..
    }

    constructor(ctx: Context, attr: AttributeSet?) :super(ctx, attr){
        //..
    }
}