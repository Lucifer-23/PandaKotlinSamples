package com.panda.kotlin.samples.code.chapter3

class Chapter3_5_7_THREE {
    open class Base {}

    class Derived : Base() {}

    open class BaseCaller {
        open fun Base.printFunctionInfo() {
            println("Base extension function in BaseCaller")
        }

        open fun Derived.printFunctionInfo() {
            println("Derived extension function in BaseCaller")
        }

        fun call(b: Base) {
            b.printFunctionInfo() // 调用扩展函数
        }
    }

    class DerivedCaller : BaseCaller() {
        override fun Base.printFunctionInfo() {
            println("Base extension function in DerivedCaller")
        }

        override fun Derived.printFunctionInfo() {
            println("Derived extension function in DerivedCaller")
        }
    }

    fun main() {
        // "Base extension function in BaseCaller"
        BaseCaller().call(Base())

        // "Base extension function in DerivedCaller"
        // ——分发接收者虚拟解析
        DerivedCaller().call(Base())

        // "Base extension function in DerivedCaller"
        // ——扩展接收者静态解析
        DerivedCaller().call(Derived())
    }
}