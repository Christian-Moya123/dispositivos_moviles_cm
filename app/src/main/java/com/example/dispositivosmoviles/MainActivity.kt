package com.example.dispositivosmoviles

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.blue
import com.google.android.material.snackbar.Snackbar
import com.example.dispositivosmoviles.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //conviuerte al activity main en un objeto
    private lateinit var binding: ActivityMainBinding
    //conviuerte al activity main en un objeto

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }



    override fun onStart(){
        super.onStart()
        init_Class()
    }

    private fun init_Class(){
        binding.button2.setOnClickListener{
            //txtBuscar.text = "el evento se ha ejecutado"
            binding.buscar.text ="el codigo esta correctamente"

            var f = Snackbar.make(
                binding.button2,
                "este es otro mensaje",
                Snackbar.LENGTH_LONG
            )

            f.setBackgroundTint(getColor(R.color.naranja)).show()
        }
    }
}