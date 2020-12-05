package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addBtn = findViewById(R.id.addBtn) as Button
        val resetBtn = findViewById(R.id.resetBtn) as Button
        val minusBtn = findViewById(R.id.resetBtn) as Button

        val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0

        addBtn.setOnClickListener {
            timesClicked++
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "1+", Toast.LENGTH_SHORT).show()

        }


        resetBtn.setOnClickListener{
            timesClicked = 0
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Reset", Toast.LENGTH_SHORT).show()
        }

        minusBtn.setOnClickListener {
            timesClicked -= 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "-1", Toast.LENGTH_SHORT).show()
        }


    }
}