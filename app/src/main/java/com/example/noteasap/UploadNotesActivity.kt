package com.example.noteasap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

private lateinit var spinner1:Spinner;
private lateinit var listView2:Spinner;
var selectedItem:String=""
class UploadNotesActivity : AppCompatActivity() {
    var level= arrayOf("University","Masters","Bachelors","+2","9/10")
    var subject= arrayOf("Science","Management")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_notes)
        spinner1=findViewById(R.id.spinner1)
        listView2=findViewById(R.id.spinner2)
            val adapter1 = ArrayAdapter(
                    this,
                    android.R.layout.simple_list_item_1,
                    level
            )
        val adapter2 = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                subject
        )
        spinner1.adapter = adapter1
        spinner1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedItem = parent?.getItemAtPosition(position).toString();

            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
            listView2.adapter = adapter2
        spinner1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedItem = parent?.getItemAtPosition(position).toString();
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }



}