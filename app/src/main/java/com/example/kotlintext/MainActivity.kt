package com.example.kotlintext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var edt1:EditText
    private lateinit var edt2:EditText
    private lateinit var edt3:EditText
    private lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt1 = findViewById(R.id.input1)
        edt2 = findViewById(R.id.input2)
        edt3 = findViewById(R.id.input3)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            val name:String = edt1.text.toString().trim()
            val email:String = edt2.text.toString().trim()
            val password:String = edt3.text.toString().trim()


            if(name.isEmpty() || email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"Please fill all the fields",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this@MainActivity,HomeScreen::class.java)
                intent.putExtra("kname",name)
                startActivity(intent)
            }
        }

    }
}