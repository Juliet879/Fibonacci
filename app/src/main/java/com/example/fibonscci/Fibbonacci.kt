package com.example.fibonscci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fibbonacci : AppCompatActivity() {
    lateinit var rvFiboNums : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fibbonacci)

        var intent = intent.getIntExtra("numbers",0)
        castViews()
        setUp(intent)

    }

    fun castViews(){
        rvFiboNums = findViewById(R.id.rvNumbers)
        }
    fun setUp(max :Int){
        var numberList = mutableListOf<Int>()

        var count = 0
        var firstNum = 0
        var secondNum = 1
        var sum = 0

        do {
            numberList.add(firstNum)
            sum = firstNum + secondNum
            firstNum = secondNum
            secondNum = sum
            count ++
        }
        while (count <= max)

        rvFiboNums.layoutManager = LinearLayoutManager(baseContext)
        var numbersAdapter = FibonacciRecyclerViewAdapter(numberList)
        rvFiboNums.adapter = numbersAdapter
    }
}

