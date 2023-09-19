package com.lkrd.mathgame

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var addition:Button
    lateinit var subtraction:Button
    lateinit var multi:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addition=findViewById(R.id.buttonAdd)
        subtraction=findViewById(R.id.buttonSub)
        multi=findViewById(R.id.buttonMulti)

        addition.setOnClickListener {

            var intent=Intent(this,GameActivity::class.java)
            startActivity(intent)
        }
        subtraction.setOnClickListener {
            val intent=Intent(this,GameActivity1::class.java)
            startActivity(intent)

        }
        multi.setOnClickListener {
            val intent=Intent(this,GameActivity2::class.java)
            startActivity(intent)
        }
    }
}