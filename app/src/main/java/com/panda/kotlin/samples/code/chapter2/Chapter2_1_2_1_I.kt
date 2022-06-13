package com.panda.kotlin.samples.code.chapter2

class Chapter2_1_2_1_I {

    fun main() {
        // sampleStart
        val x = 5 / 2
        // ERROR: Operator '==' can not be applied to 'Int' and 'Double'
        // println(x == 2.5)
        println(x == 2)
        // sampleEnd
    }
}