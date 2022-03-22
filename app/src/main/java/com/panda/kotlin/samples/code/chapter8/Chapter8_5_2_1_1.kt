package com.panda.kotlin.samples.code.chapter8

class Chapter8_5_2_1_1 {

    data class Counter(val dayIndex: Int) {
        operator fun plus(increment: Int): Counter {
            return Counter(dayIndex + increment)
        }

        operator fun plus(other: Counter): Counter {
            return Counter(dayIndex + other.dayIndex)
        }
    }

    fun main() {
        var testCounter = Counter(3)
        val other = Counter(3)
        println(testCounter + 5)
        println(testCounter + other)
    }
}