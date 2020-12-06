package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.textView)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val minusBtn = findViewById<Button>(R.id.minusBtn)
        val enterBtn = findViewById<Button>(R.id.enterBtn)
        
        var timesClicked = 0
        var maxValue = 0

        val maximumEnteryEditView = findViewById<EditText>(R.id.maximumEntryED)

        enterBtn.setOnClickListener {
            maxValue = maximumEnteryEditView.text.toString().toInt()
        }


        addBtn.setOnClickListener {
          if (timesClicked < maxValue) {
              timesClicked++
              myTextView.text = timesClicked.toString()
              Toast.makeText(this@MainActivity, "1+", Toast.LENGTH_SHORT).show()
          }else if (timesClicked >= maxValue){
              timesClicked = maxValue
              Toast.makeText(this@MainActivity, "Maximum capacity reached!!!", Toast.LENGTH_LONG).show()
          }
          }


        resetBtn.setOnClickListener {
            timesClicked = 0
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Reset", Toast.LENGTH_SHORT).show()
        }

        minusBtn.setOnClickListener {
            if (timesClicked > 0) {
                timesClicked -= 1
            }
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "-1", Toast.LENGTH_SHORT).show()
        }


    }
}