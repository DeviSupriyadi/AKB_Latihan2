package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Spinner

class regis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis)

        val JobSpinner: Spinner = findViewById(R.id.job_spinner)
        val bloodSpinner: Spinner = findViewById(R.id.spn_blood_regis)
        val rhesusSpinner: Spinner = findViewById(R.id.spn_rhesus_regis)

        ArrayAdapter.createFromResource(
            this, R.array.job_array,R.layout.spinner_text_style
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            JobSpinner.adapter = adapter
        }
        ArrayAdapter.createFromResource(
            this, R.array.arr_blood_regis,R.layout.spinner_text_style
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            bloodSpinner.adapter = adapter
        }
        ArrayAdapter.createFromResource(
            this, R.array.arr_rhesus_regis,R.layout.spinner_text_style
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            rhesusSpinner.adapter = adapter
        }
    }

    fun onRadioButtonClicked(view: View){
        if(view is RadioButton){
            val checked = view.isChecked
        }
    }
}
