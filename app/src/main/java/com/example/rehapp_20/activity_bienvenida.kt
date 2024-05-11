package com.example.rehapp_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class activity_bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val txt: ImageView = findViewById(R.id.buttonavanzardeBienvenida)
        txt.setOnClickListener {

            val intent: Intent = Intent(this, activity_perfil_usuario:: class.java)
            startActivity(intent)

    }
}
}