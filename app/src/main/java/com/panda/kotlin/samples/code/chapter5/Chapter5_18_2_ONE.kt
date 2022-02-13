package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_2_ONE {

    fun main() {
        // sampleStart
        val numbersMap = mapOf(
            "key1" to 1,
            "key2" to 2,
            "key3" to 3,
            "key11" to 11
        )
        val filteredMap = numbersMap.filter { (key, value) ->
            key.endsWith("1") && value >
                    10
        }

        println(filteredMap)
        // sampleEnd
    }
}