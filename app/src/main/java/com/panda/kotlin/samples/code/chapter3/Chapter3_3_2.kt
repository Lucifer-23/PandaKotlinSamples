package com.panda.kotlin.samples.code.chapter3

class Chapter3_3_2 {
    interface MyInterface {
        val prop: Int // 抽象的
        val propertyWithImplementation: String
            get() = "foo"

        fun foo() {
            print(prop)
        }

    }

    class Child : MyInterface {
        override val prop: Int = 29
    }
}