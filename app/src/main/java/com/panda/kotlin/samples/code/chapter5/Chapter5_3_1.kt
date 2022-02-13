package com.panda.kotlin.samples.code.chapter5

class Chapter5_3_1 {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        val listIterator = numbers.listIterator()

        while (listIterator.hasNext()) listIterator.next()

        println("Iterating backwards:")

        while (listIterator.hasPrevious()) {
            print("Index: ${listIterator.previousIndex()}")
            println(", value: ${listIterator.previous()}")
        }
        // sampleEnd
    }
}