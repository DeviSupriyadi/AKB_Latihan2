package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_almost.*

class almost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)

        ver.setOnClickListener(){
            val intent = Intent(this,verify::class.java)
            startActivity(intent)
        }
    }
}
