package com.example.testeactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainDadoD12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dadod12)


        val buttonD12 = findViewById<Button>(R.id.buttonD12)

        buttonD12.setOnClickListener {
            rolarDados(12)
        }

    }

    fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textResultado)

        textResultado.text = valor.toString()
    }


}