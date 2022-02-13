package com.panda.kotlin.samples.code.chapter2

class Chapter2_1_3_9 {

    fun main() {

        var num = 0b101101

        printInt(num)

        printInt((num and (1 shl 2).inv()))
        println(2.7182818284f)
    }

    private fun printInt(integer: Int) {
        print("Binary is ${Integer.toBinaryString(integer)}")
        println(", Decimal is $integer")
    }
}