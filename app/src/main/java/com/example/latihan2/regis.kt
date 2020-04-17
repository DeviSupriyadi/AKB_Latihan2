package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_regis.*
import android.content.Intent
import android.view.View
import android.widget.*

class regis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis)

        //gol darah
        val gbloodSpinner : Spinner = findViewById(R.id.spblood)
        ArrayAdapter.createFromResource(this,R.array.blood_regis,R.layout.harstyles).also {
                adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            gbloodSpinner.adapter = adapter
        }

        //Reshus
        val gresusSpinner : Spinner = findViewById(R.id.resus)
        ArrayAdapter.createFromResource(this,R.array.resus_regis,R.layout.harstyles).also {
                adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            gresusSpinner.adapter = adapter
        }

        //job
        val gkerjaSpinner : Spinner = findViewById(R.id.joob)
        ArrayAdapter.createFromResource(this,R.array.ker_array,R.layout.harstyles).also {
                adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            gkerjaSpinner.adapter = adapter
        }

        toolbars.setNavigationIcon(R.drawable.ic_header_back)


    }
    fun onRadioButtonClicked(view: View){
        if(view is RadioButton){
            val checked = view.isChecked
        }
    }
}
