package com.panda.kotlin.samples.code.chapter3

class Chapter3_14_2 {
    interface Base {
        fun print()
    }

    class BaseImpl(val x: Int) : Base {
        override fun print() {
            print(x)
        }
    }

    class Derived(b: Base) : Base by b

    fun main() {
        val b = BaseImpl(10)
        Derived(b).print()
    }
}