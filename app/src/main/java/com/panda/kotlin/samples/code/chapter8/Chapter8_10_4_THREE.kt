package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_4_THREE {

    fun main() {
        fun displaySubstringPosition(input: String, sub: String) {
            input.indexOf(sub).takeIf { it >= 0 }?.let {
                println("The substring $sub is found in $input.")
                println("Its start position is $it.")
            }
        }

        displaySubstringPosition("010000011", "11")
        displaySubstringPosition("010000011", "12")
    }
}