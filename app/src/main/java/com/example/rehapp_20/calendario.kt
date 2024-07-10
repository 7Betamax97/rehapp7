package com.example.rehapp_20

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class calendario : AppCompatActivity() {
    val selectedCalendar = Calendar.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calendario)

    }
    fun onClickScheduledDate(view: android.view.View){
        val etScheduledDate = findViewById<EditText>(R.id.btn_go_to_calendario)

        val year = selectedCalendar.get(Calendar.YEAR)
        val month = selectedCalendar.get(Calendar.MONTH)
        val dayOfMonth = selectedCalendar.get(Calendar.DAY_OF_MONTH)
        val listener = DatePickerDialog.OnDateSetListener{ datePicker, y, m, d ->
            selectedCalendar.set(y,m,d)
            etScheduledDate.setText("$y-$m-$d")
        }
        DatePickerDialog(this, listener, year, month, dayOfMonth).show()


        val spinnerHours =findViewById<Spinner>(R.id.spinner_horas)

        val optionsHours = arrayOf("8:00 a.m.", "9:00 a.m.", "10:00 a.m.", "11:00 a.m.")
        spinnerHours.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, optionsHours)

        val spinnerFisio =findViewById<Spinner>(R.id.spinner_fisio)

        val optionsFisio = arrayOf("Fisioterapeuta 1", "Fisioterapeuta 2", "Fisioterapeuta 3", "Fisioterapeuta 4")
        spinnerFisio.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, optionsFisio)

        val spinnerModulo =findViewById<Spinner>(R.id.spinner_modulo)

        val optionsModulo = arrayOf("Rehabilitacion fractura de muñeca", "Ejercicios sindrome tunel carpiano", "Ejercicios mejora dedo en gatillo", "Artrosis mano y dedos", "Extension del dedo")
        spinnerModulo.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, optionsModulo)

        val btnConfirm = findViewById<Button>(R.id.btn_crear_cita)
        val cvConfirm = findViewById<CardView>(R.id.cv_crear_cita)

        btnConfirm.setOnClickListener{
            Toast.makeText(applicationContext,"Cita creada exitosamente!!", Toast.LENGTH_SHORT).show()
            finish()
        }





    }


    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Estas seguro que desea salir?")
        builder.setMessage("Si abandonas el registro, los datos ingresados se perderan.")
        builder.setPositiveButton("Salir"){_, _ ->
            finish()

        }
        builder.setNegativeButton("Continuar"){dialog, _ ->
            dialog.dismiss()

        }

        val dialog = builder.create()
        dialog.show()

    }
}