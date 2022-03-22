package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_7_I {

    fun main() {

       loop@ for (i in 0..100) {
           for (j in 1..100) {
               if (j % 13 == 0) {
                   break@loop
               }
           }
       }
    }
}