package com.panda.kotlin.samples.code.chapter2

class Chapter2_1_3_3_4 {

    fun main() {

        var hex = charArrayOf(
            '0',
            '1',
            '2',
            '3',
            '4',
            '5',
            '6',
            '7',
            '8',
            '9',
            'a',
            'b',
            'c',
            'd',
            'e',
            'f'
        )

        var b = 0xf1

        println("b = 0x${hex[(b shr 4) and 0x0f]}${hex[b and 0x0f]}")
    }
}