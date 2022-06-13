package com.panda.kotlin.samples.code.chapter3

class Chapter3_3_3 {
    interface Named {
        val name: String
    }

    interface Person : Named {
        val firstName: String
        val lastName: String
        override val name: String get() = "$firstName $lastName"
    }

    class Position

    data class Employee(
        // 不必实现"name"
        override val firstName: String,
        override val lastName: String,
        val position: Position
    ) : Person
}