package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_regis.*
import android.content.Intent
import android.view.View
import android.widget.*

/* Tanggal Penggerjaan: 15-16 April 2020
* NIM: 10117181
* Nama: Devi Tiana Octaviani S
* Kelas: IF-5
*/

class regis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis)

        move.setOnClickListener() {
            val intent = Intent(this, almost::class.java)
            startActivity(intent)



            toolbars.setNavigationIcon(R.drawable.ic_header_back)


        }
        fun onRadioButtonClicked(view: View) {
            if (view is RadioButton) {
                val checked = view.isChecked
            }
        }
    }
}
