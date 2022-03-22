package com.panda.kotlin.samples.code.chapter5

class Chapter5_14_1_I {

    fun main() {
        // sampleStart
        val numbers = listOf(5, 2, 10, 4)
        val sum = numbers.reduce { sum, element -> sum + element }

        println(sum)

        val sumDoubled = numbers.fold(0) { sum,
                                           element ->
            sum + element * 2
        }

        println(sumDoubled)

        //错误：第一个元素在结果中没有加倍
        // val sumDoubledReduce = numbers.reduce { sum,
        //                                         element ->
        //     sum + element * 2
        // }

        // println(sumDoubledReduce)
        // sampleEnd
    }
}