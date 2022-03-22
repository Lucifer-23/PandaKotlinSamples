package com.panda.kotlin.samples.code.chapter3

class Chapter3_5_2_III {
    fun main() {
        // sampleStart
        class Example {
            fun printFunctionType() {
                println("Class method")
            }
        }

        fun Example.printFunctionType(i: Int) {
            println("Extension function")
        }

        Example().printFunctionType(1)
        // sampleEnd
    }
}