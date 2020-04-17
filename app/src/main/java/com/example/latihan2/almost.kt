package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_almost.*

/* Tanggal Penggerjaan: 17 April 2020
* NIM: 10117181
* Nama: Devi Tiana Octaviani S
* Kelas: IF-5
*/

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
