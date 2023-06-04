package com.example.dispositivosmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.example.dispositivosmoviles.databinding.ActivityMainBinding
import com.example.dispositivosmoviles.databinding.ActivitySecond2Binding


class MainActivity2 : AppCompatActivity() {
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
            //binding.buscar.text ="el codigo esta correctamente"

            var f = Snackbar.make(
                binding.button2,
                "este es otro mensaje",
                Snackbar.LENGTH_LONG
            )

            var intent = Intent(
                this, ActivitySecond2Binding::class.java
            )

            intent.putExtra("var1", binding.buscar.text.toString())

            startActivity(intent)

            f.setBackgroundTint(getColor(R.color.naranja)).show()
        }
    }


}