package com.panda.kotlin.samples.code.chapter3

class Chapter3_5_2_II {
    fun main() {
        // sampleStart
        class Example {
            fun printFunctionType() {
                println("Class method")
            }
        }

        fun Example.printFunctionType() {
            println("Extension function")
        }

        Example().printFunctionType()
        // sampleEnd
    }
}