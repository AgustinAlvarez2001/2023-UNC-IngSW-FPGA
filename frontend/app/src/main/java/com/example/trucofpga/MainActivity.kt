package com.example.trucofpga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonEntrar: Button = findViewById(R.id.buttonLogin)
        botonEntrar.setOnClickListener {
            val intent: Intent = Intent(this, comoJugar::class.java)
            startActivity(intent)
        }


    }
}