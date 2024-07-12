package com.example.rehapp_20

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registro_exitoso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro_exitoso)


        val txt: Button = findViewById(R.id.ButtonAvanzarEncuesta)
        txt.setOnClickListener {

            val intent: Intent = Intent(this, activity_encuesta1::class.java)
            startActivity(intent)
        }

    }
}