package com.panda.kotlin.samples.code.chapter2

class Chapter2_1_3_2_4 {

    fun main() {

        var num = 0xFFFFFFE

        printInt(num)

        for (i in 0 until 4) {
            num = num shl 1

            printInt(num)
        }
        printInt(-1)
        printInt((-1) shr 2)
    }

    private fun printInt(integer: Int) {
        print("Binary is ${Integer.toBinaryString(integer)}")
        println(", Decimal is $integer")
    }
}