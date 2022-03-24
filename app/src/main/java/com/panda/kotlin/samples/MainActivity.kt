package com.panda.kotlin.samples

import android.app.Activity
import android.os.Bundle
import com.panda.kotlin.samples.code.chapter1.Chapter1_1_13_IV
import com.panda.kotlin.samples.code.chapter8.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Chapter1_1_13_IV().main()
    }
}