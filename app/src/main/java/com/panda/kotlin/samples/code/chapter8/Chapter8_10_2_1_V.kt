package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_1_V {

    fun main() {
        val numbers = listOf("one", "two", "three", "four")
        val modifiedFirstItem = numbers.first().let { firstItem ->
            println("The first item of the list is '$firstItem'")
            if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
        }.toUpperCase()
        println("First item after modifications: '$modifiedFirstItem'")
    }
}