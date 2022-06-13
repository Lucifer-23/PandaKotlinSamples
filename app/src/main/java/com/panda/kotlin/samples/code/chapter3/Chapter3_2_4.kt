package com.panda.kotlin.samples.code.chapter3

class Chapter3_2_4 {
    class TestSubject {
        fun method() {
            lateinit var test: String
            test = "test"
            println(test)
        }
    }

    class MyTest {
        lateinit var subject: TestSubject
        // set(value){} // lateinit无法修饰有自定义getter和setter的属性
        // lateinit val subject: TestSubject // lateinit无法修饰val的属性
        // lateinit var test: Int // lateinit无法修饰原始数据类型的属性

        @SetUp
        fun setup() {
            subject = TestSubject()
        }

        @Test
        fun test() {
            subject.method() // 直接引用
        }
    }

    fun main() {
        val myTest = MyTest()
        myTest.setup()
        myTest.test()
    }
}

annotation class Test

annotation class SetUp
