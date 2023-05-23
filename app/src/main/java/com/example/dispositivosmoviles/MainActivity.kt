package com.example.dispositivosmoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.blue
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    //conviuerte al activity main en un objeto
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton1 = findViewById<Button>(R.id.button2)
        var txtBuscar = findViewById<TextView>(R.id.buscar)

        boton1.text = "INGRESAR"
        boton1.setOnClickListener{
            txtBuscar.text = "el evento se ha ejecutado"
            //Toast.makeText(this, "HOLA MUNDO EJ", Toast.LENGTH_SHORT).show()

           var f = Snackbar.make(
                boton1,
                "este es otro mensaje",
                Snackbar.LENGTH_LONG)

            f.setBackgroundTint(getResources().getColor(R.color.naranja)).show()


        }
    }
}