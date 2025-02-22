package com.example.kotlintext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeScreen : AppCompatActivity() {

    private lateinit var txt1:TextView
    private lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        txt1 = findViewById(R.id.mytext1)

        val data = intent.getStringExtra("kname")
        txt1.text = "Welcome to Our Home Page $data"

        btn = findViewById(R.id.btnBack)
        btn.setOnClickListener {
            val intent = Intent(this@HomeScreen,MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish() // it closes the activity
        }

    }
}