package com.panda.kotlin.samples.code.chapter3

class Chapter3_3_4 {
    interface A {
        fun foo() {
            println("A")
        }

        fun bar()
    }

    interface B {
        fun foo() {
            println("B")
        }

        fun bar() {
            println("bar")
        }
    }

    class C : A {
        override fun bar() {
            println("bar")
        }
    }

    class D : A, B {
        override fun foo() {
            super<A>.foo()
            super<B>.foo()
        }

        override fun bar() {
            super.bar()
        }
    }
}