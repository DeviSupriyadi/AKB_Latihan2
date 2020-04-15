package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_regis.*

class regis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis)

        toolbars.setNavigationIcon(R.drawable.ic_header_back)
    }
}
