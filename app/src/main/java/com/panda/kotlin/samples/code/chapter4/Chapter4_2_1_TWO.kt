package com.panda.kotlin.samples.code.chapter4

class Chapter4_2_1_TWO {
    fun main() {
        // sampleStart
        val items = listOf(1, 2, 3, 4, 5)

        // Lambdas表达式是花括号括起来的代码块。
        items.fold(0, {
            // 如果一个lambda表达式有参数，前面是参数，后跟"->"
                acc: Int, i: Int ->
            print("acc = $acc, i = $i, ")
            val result = acc + i
            println("result = $result")
            // lambda表达式中的最后一个表达式是返回值：
            result
        })

        // lambda表达式的参数类型是可选的，如果能够推断出来的话：
        val joinedToString = items.fold("Elements:",
            { acc, i -> acc + " " + i })

        // 函数引用也可以用于高阶函数调用：
        val product = items.fold(1, Int::times)
        // sampleEnd

        println("joinedToString = $joinedToString")
        println("product = $product")
    }
}