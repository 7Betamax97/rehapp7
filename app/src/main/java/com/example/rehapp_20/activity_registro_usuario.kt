package com.example.rehapp_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity_registro_usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_usuario)

        val txt: Button = findViewById(R.id.ButtonRegistroExitoso)
        txt.setOnClickListener {

            val intent: Intent = Intent(this, activity_inicio_sesion:: class.java)
            startActivity(intent)
        }
        val con_cuenta: ImageView = findViewById(R.id.image_nombre_registro)
        con_cuenta.setOnClickListener {

            val intent: Intent = Intent(this, activity_encuesta1:: class.java)
            startActivity(intent)
        }

    }
}
