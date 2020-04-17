package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

/* Tanggal Penggerjaan: 15 April 2020
* NIM: 10117181
* Nama: Devi Tiana Octaviani S
* Kelas: IF-5
*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registt = findViewById(R.id.regist) as TextView
        registt.setOnClickListener{
            startActivity(Intent(this,regis::class.java))
        }
    }
}
