package com.gauravthapa.useractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class spinnerActivity : AppCompatActivity() {
    private val languages = arrayOf("Nepali", "Hindi", "English", "chinese")
    private lateinit var  spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        spinner = findViewById(R.id.spinner)
        //array adapter
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            languages
            )
        spinner.adapter = adapter

        spinner.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener{
                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }

                    override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long) {
                        val selectedItem = parent?.getItemIdAtPosition(position).toString()
                        Toast.makeText(
                            this@spinnerActivity, "selected item: $selectedItem", Toast.LENGTH_SHORT
                        ).show()
                    }


                    }


                }

    }
