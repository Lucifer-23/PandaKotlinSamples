package com.panda.kotlin.samples

import android.app.Activity
import android.os.Bundle
import com.panda.kotlin.samples.code.chapter3.Chapter3_10_4_TWO

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Chapter3_10_4_TWO().main()
    }
}