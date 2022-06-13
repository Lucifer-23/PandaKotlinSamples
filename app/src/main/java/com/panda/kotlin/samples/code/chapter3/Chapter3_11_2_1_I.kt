package com.panda.kotlin.samples.code.chapter3

class Chapter3_11_2_1_I {

    class MyClass {
        companion object Factory {
            fun create(): MyClass = MyClass()
        }
    }
}