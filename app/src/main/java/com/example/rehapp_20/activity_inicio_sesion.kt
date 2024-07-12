package com.example.rehapp_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity_inicio_sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)



        val txt: Button = findViewById(R.id.ButtonLinkRegistro)
        txt.setOnClickListener {

            val intent: Intent = Intent(this, activity_registro_usuario:: class.java)
            startActivity(intent)
        }
        val registrar_fisio: Button = findViewById(R.id.ButtonRegistroFisio)
        registrar_fisio.setOnClickListener {

            val intent: Intent = Intent(this, activity_registro_fisio:: class.java)
            startActivity(intent)
        }
        val con_cuenta: Button = findViewById(R.id.ButtonLinkCuenta)
        con_cuenta.setOnClickListener {

            val intent: Intent = Intent(this, activity_bienvenida:: class.java)
            startActivity(intent)
        }

    }
}