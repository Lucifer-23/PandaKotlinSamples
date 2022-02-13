package com.panda.kotlin.samples.code.chapter3

typealias NameTypeAlias = String

inline class NameInlineClass(val s: String)

fun acceptString(s: String) {}

fun acceptNameTypeAlias(n: NameTypeAlias) {}

fun acceptNameInlineClass(p: NameInlineClass) {}

class Chapter3_13_4 {
    fun main() {
        val nameAlias: NameTypeAlias = ""
        val nameInlineClass: NameInlineClass = NameInlineClass("")
        val string: String = ""
        // 正确——传递别名类型的实参替代函数中基础类型的形参
        acceptString(nameAlias)
        // 错误——不能传递内联类的实参替代函数中基础类型的形参
        // acceptString(nameInlineClass)

        /**
         *  And vice versa:
         */
        // 正确——传递基础类型的实参替代函数中别名类型的形参
        acceptNameTypeAlias(string)
        // 错误——不能传递基础类型的实参替代函数中内联类类型的形参
        // acceptNameInlineClass(string)
    }
}