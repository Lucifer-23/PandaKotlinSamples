package com.panda.kotlin.samples.code.chapter3

class Chapter3_8_1_1_IV {

    fun demo(x: Comparable<Number>) {
        // 1.0拥有类型Double，它是Number的子类型
        x.compareTo(1.0)
        // 因此，我们可以将x赋给类型为Comparable <Double>的变量
        val y: Comparable<Double> = x
    }

    open class CustomComparable(val value: Number) : Comparable<Number> {
        override fun compareTo(other: Number): Int {
            return Math.round(value.toFloat() - other.toFloat())
        }
    }

    fun main() {

        demo(CustomComparable(2.0))
    }
}