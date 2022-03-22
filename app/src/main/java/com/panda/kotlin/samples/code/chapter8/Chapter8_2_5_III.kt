package com.panda.kotlin.samples.code.chapter8

class Chapter8_2_5_III {

    inline fun <reified A, reified B> Pair<*, *>.asPairOf(): Pair<A, B>? {
        if (first !is A || second !is B) {
            return null
        } else {
            return first as A to second as B
        }
    }

    val somePair: Pair<Any?, Any?> = "items" to listOf(1, 2, 3)

    val stringToSomething = somePair.asPairOf<String, Any>()

    val stringToInt = somePair.asPairOf<String, Int>()

    val stringToList = somePair.asPairOf<String, List<*>>()

    // 破坏类型安全！
    val stringToStringList = somePair.asPairOf<String, List<String>>()

    fun main() {
        println(somePair)
        println(stringToSomething)
        println(stringToInt)
        println(stringToList)
        println(stringToStringList)
    }
}