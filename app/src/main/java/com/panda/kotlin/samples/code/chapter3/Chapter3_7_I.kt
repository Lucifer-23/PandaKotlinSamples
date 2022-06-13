package com.panda.kotlin.samples.code.chapter3

class Chapter3_7_I {

    sealed class Expr

    data class Const(val number: Double) : Expr()

    data class Sum(val e1: Expr, val e2: Expr) : Expr()

    object NotANumber : Expr()
}