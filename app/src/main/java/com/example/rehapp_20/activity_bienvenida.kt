package com.example.rehapp_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class activity_bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val txt: Button = findViewById(R.id.Button_iniciar_sesion)
        txt.setOnClickListener {

            val intent: Intent = Intent(this, activity_inicio_sesion:: class.java)
            startActivity(intent)

    }
}
}