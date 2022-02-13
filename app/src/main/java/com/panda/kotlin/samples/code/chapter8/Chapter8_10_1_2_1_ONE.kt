package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_1_2_1_ONE {

    fun main() {
        val numberList = mutableListOf<Double>()
        numberList.also { println("Populating the list") }
            .apply {
                add(2.71)
                add(3.14)
                add(1.0)
            }
            .also { println("Sorting the list") }
            .sort()
        println(numberList)
    }
}