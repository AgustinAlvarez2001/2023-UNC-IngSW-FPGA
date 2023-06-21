package com.example.trucofpga

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class comoJugar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId") //nose para que es
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_jugar)

        val boton1Vs1: Button = findViewById(R.id.boton1Vs1)
        boton1Vs1.setOnClickListener {
            val intent: Intent = Intent(this, esperaOponente::class.java)
            startActivity(intent)
        }
        val boton1VsPc: Button = findViewById(R.id.boton1VsPc)
        boton1VsPc.setOnClickListener {
            val intent: Intent = Intent(this, mesaJuego::class.java)
            startActivity(intent)
        }
        val botonInstrucciones: Button = findViewById(R.id.botonInstrucciones)
        botonInstrucciones.setOnClickListener {
            val intent: Intent = Intent(this, TextoDeAyuda::class.java)
            startActivity(intent)
        }
    }
}