package com.panda.kotlin.samples

import android.app.Activity
import android.os.Bundle
import com.panda.kotlin.samples.code.chapter1.Chapter1_1_13_IV
import com.panda.kotlin.samples.code.chapter2.Chapter2_3_8_TEST
import com.panda.kotlin.samples.code.chapter3.Chapter3_13_1
import com.panda.kotlin.samples.code.chapter3.Chapter3_14_2_1_TEST
import com.panda.kotlin.samples.code.chapter3.Chapter3_2_4
import com.panda.kotlin.samples.code.chapter8.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Chapter3_14_2_1_TEST().main()
    }
}