package com.panda.kotlin.samples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.panda.kotlin.samples.code.chapter2.Chapter2_1_1_TWO
import com.panda.kotlin.samples.code.chapter2.Chapter2_1_3_2_4
import com.panda.kotlin.samples.code.chapter2.Chapter2_1_3_9

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Chapter2_1_3_9().main()
    }
}