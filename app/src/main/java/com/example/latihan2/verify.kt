package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_verify.*

class verify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        send.setOnClickListener(){
            val intent = Intent(this,profile::class.java)
            startActivity(intent)
        }
    }
}
