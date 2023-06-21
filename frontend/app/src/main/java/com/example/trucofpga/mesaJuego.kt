package com.example.trucofpga

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mesaJuego : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mesa_juego)

        val botonAyuda: Button = findViewById(R.id.botonAyuda)
        botonAyuda.setOnClickListener {
            val intent: Intent = Intent(this, TextoDeAyuda::class.java)
            startActivity(intent)
        }
    }
}