package com.example.rehapp_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class activity_perfil_usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_usuario)

        val txt: TextView = findViewById(R.id.modulo1RehabilitacionMuñeca)
        txt.setOnClickListener {

            val intent: Intent = Intent(this, modulo1:: class.java)
            startActivity(intent)

        }
        val con_cuenta: TextView = findViewById(R.id.modulo2SindromeTunel)
        con_cuenta.setOnClickListener {

            val intent: Intent = Intent(this, modulo2:: class.java)
            startActivity(intent)

        }
        val con_cuenta1: TextView = findViewById(R.id.modulo3DedoGatillo)
        con_cuenta1.setOnClickListener {

            val intent: Intent = Intent(this, modulo3:: class.java)
            startActivity(intent)

        }
        }
    }
