package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_2_TWO {

    fun main() {
        // sampleStart
        val colors = listOf("red", "brown", "grey")
        val animals = listOf("fox", "bear", "wolf")

        println(colors.zip(animals) { color, animal ->
            "The ${animal.capitalize()} is $color"
        })
        // sampleEnd
    }
}