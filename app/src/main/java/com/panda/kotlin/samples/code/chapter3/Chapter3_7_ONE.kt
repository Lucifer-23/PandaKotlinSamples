package com.panda.kotlin.samples.code.chapter3

class Chapter3_7_ONE {

    sealed class Expr {
    }

    data class Const(val number: Double) : Expr()

    data class Sum(val e1: Expr, val e2: Expr) : Expr()

    object NotANumber : Expr()

    fun main() {

        println("Sealed test ${eval(Sum(Sum(Const(4.0), Const(5.0)), Const(3.0)))}")
    }

    fun eval(expr: Expr): Double = when (expr) {
        is Const -> expr.number
        is Sum -> eval(expr.e1) + eval(expr.e2)
        NotANumber -> Double.NaN
    }
}