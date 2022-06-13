package com.panda.kotlin.samples.code.chapter3

class Chapter3_14_2_1_TEST {
    interface Base {
        val message: String
        fun print()
    }

    class BaseImpl(val x: Int) : Base {
        override val message = "BaseImpl: x = $x"
        override fun print() {
            println(message)
        }
    }

    class Derived(b: Base) : Base by b {
        // 在b的'print'实现中不会访问到这个属性
        override val message = "Message of Derived"

        override fun print() {
            println(message)
        }
    }

    fun main() {
        val b = BaseImpl(10)
        val derived = Derived(b)
        derived.print()
        println(derived.message)
    }
}