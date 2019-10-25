package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.layout.simple_list_item_1
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = listOf("Kotlin","Python","Ruby","JavaScript","PHP")

        //memberikan adapter keListView
        List_View.adapter = ArrayAdapter(this, simple_list_item_1,languages)

        //menampilkan item saat diklik
        List_View.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"Anda Memilih : ${languages[position]}",
                Toast.LENGTH_SHORT).show()}
    }



}
