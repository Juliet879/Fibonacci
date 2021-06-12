package com.example.fibonscci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var btnCheck:Button
    lateinit var edCount:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        setUp()
    }

    fun castViews(){
        btnCheck = findViewById(R.id.btnCheck)
        edCount = findViewById(R.id.edCount)
    }
    fun setUp() {
        btnCheck.setOnClickListener {
            var intent = Intent(baseContext, Fibbonacci::class.java)
            var numbers = edCount.text.toString().toInt()
            intent.putExtra("numbers",numbers)
            startActivity(intent)
        }

    }
}