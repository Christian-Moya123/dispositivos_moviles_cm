package com.example.dispositivosmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import com.example.dispositivosmoviles.databinding.ActivitySecond2Binding

class SecondActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivitySecond2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("uce", "entrada Oncreate")
    }

    override fun onStart(){
        super.onStart()
        init_Class()
        var name =""
        intent.extras.let {
            name = it?.getString("var1")!!

        }
        binding.textView2S.text=" que mas ve " + name
    }

    private fun init_Class(){
        binding.button2S.setOnClickListener{
            //txtBuscar.text = "el evento se ha ejecutado"
                binding.textView2S.text ="Correcto"

            var f = Snackbar.make(
                binding.button2S,
                "otro mensaje",
                Snackbar.LENGTH_LONG
            )
            var intent = Intent(
                this,MainActivity2::class.java
            )
            startActivity(intent)

            f.setBackgroundTint(getColor(R.color.naranja)).show()
        }
    }
}