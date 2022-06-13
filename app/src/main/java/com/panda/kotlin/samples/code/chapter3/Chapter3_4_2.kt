package com.panda.kotlin.samples.code.chapter3

class Chapter3_4_2 {
    open class Outer {
        private val a = 1
        protected open val b = 2
        internal val c = 3
        val d = 4 // 默认为public

        protected class Nested {
            public val e: Int = 5
            private val f = 6 // Outer类不可访问
        }
    }

    class Subclass : Outer() {
        // a不可见
        // b、c、d可见
        // Nested和e可见

        override val b = 5 // "b"为protected
    }

    class Unrelated(o: Outer) {
        // o.a、o.b不可见
        // o.c(相同模块)和o.d可见
        // Outer.Nested不可见，Nested::e也不可见
    }
}