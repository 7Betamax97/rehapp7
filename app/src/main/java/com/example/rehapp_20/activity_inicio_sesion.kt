package com.example.rehapp_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class activity_inicio_sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)



        val txt: ImageView = findViewById(R.id.linkRegistro)
        txt.setOnClickListener {

            val intent: Intent = Intent(this, activity_registro_usuario:: class.java)
            startActivity(intent)
        }
        val con_cuenta: ImageView = findViewById(R.id.linkcuenta)
        con_cuenta.setOnClickListener {

            val intent: Intent = Intent(this, activity_bienvenida:: class.java)
            startActivity(intent)
        }

    }
}