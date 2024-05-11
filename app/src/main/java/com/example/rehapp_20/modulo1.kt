package com.example.rehapp_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class modulo1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modulo1)


        val txt: TextView = findViewById(R.id.text_titulo1ejercicio)
        txt.setOnClickListener {

            val intent: Intent = Intent(this, modulo11:: class.java)
            startActivity(intent)

        }
    }
}


