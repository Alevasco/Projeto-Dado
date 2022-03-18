package com.example.testeactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainDadoD20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dadod20)

        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD20.setOnClickListener {
            rolarDados(20)
        }

    }

        fun rolarDados(lados: Int) {

            val valor = (1..lados).random()

            val textResultado = findViewById<TextView>(R.id.textResultado)

            textResultado.text = valor.toString()
        }


}
