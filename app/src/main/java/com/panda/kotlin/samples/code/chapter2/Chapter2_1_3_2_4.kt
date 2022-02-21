package com.panda.kotlin.samples.code.chapter2

class Chapter2_1_3_2_4 {

    fun main() {

        var num = 0xFFFFFFE

        printInt(num)

        for (i in 0 until 4) {
            num = num shl 1

            printInt(num)
        }

        var negativeTest = -0b1111111111111111111111111111110
        print("Binary of negativeTest is ${Integer.toBinaryString(negativeTest)}")
        println(", Decimal is $negativeTest")
        negativeTest = negativeTest shl 2
        print("After shl 2, binary of negativeTest is ${Integer.toBinaryString(negativeTest)}")
        println(", Decimal is $negativeTest")
    }

    private fun printInt(integer: Int) {
        print("Binary is ${Integer.toBinaryString(integer)}")
        println(", Decimal is $integer")
    }
}