package com.ht117.yukute.ui.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ht117.yukute.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
}