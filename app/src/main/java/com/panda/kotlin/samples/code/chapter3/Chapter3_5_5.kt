package com.panda.kotlin.samples.code.chapter3

class Chapter3_5_5 {
    class MyClass {
        companion object {} // 将被称为"Companion"
    }

    fun MyClass.Companion.printCompanion() {
        println("companion")
    }

    fun main() {
        MyClass.printCompanion()
    }
}