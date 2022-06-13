package com.panda.kotlin.samples.code.chapter3

class Chapter3_1_2_5 {
    open class Rectangle {

        open fun draw() { /* ... */
        }
    }

    interface Polygon {
        fun draw() {/* ... */
        } // 接口成员默认就是"open"的
    }

    class Square() : Rectangle(), Polygon {
        override fun draw() {
            super<Rectangle>.draw() // Rectangle.draw()
            super<Polygon>.draw() // 调用Polygon.draw()
        }
    }
}