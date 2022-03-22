package com.panda.kotlin.samples.code.chapter3

class Chapter3_8_1_1_IV {

    interface Comparable<in T> {
        operator fun compareTo(other: T): Int
    }

    fun demo(x: Comparable<Number>) {
        // 1.0拥有类型Double，它是Number的子类型
        x.compareTo(1.0)
        // 因此，我们可以将x赋给类型为Comparable <Double>的变量
        val y: Comparable<Double> = x
    }

    fun main() {

        demo(object : Comparable<Number> {
            override fun compareTo(other: Number): Int {
                return 0
            }
        })
    }
}