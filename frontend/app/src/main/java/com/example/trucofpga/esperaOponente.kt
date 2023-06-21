package com.example.trucofpga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class esperaOponente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espera_oponente)

        val botonNext: Button = findViewById(R.id.botonNext)
        botonNext.setOnClickListener {
            val intent: Intent = Intent(this, mesaJuego::class.java)
            startActivity(intent)
        }

    }
}