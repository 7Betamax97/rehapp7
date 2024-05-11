package com.example.rehapp_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class modulo5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulo5)

        val txt: TextView = findViewById(R.id.text_titulo3ejercicio)
        txt.setOnClickListener {

            val intent: Intent = Intent(this, modulo55:: class.java)
            startActivity(intent)
        }
    }
}