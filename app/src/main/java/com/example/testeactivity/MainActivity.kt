package com.example.testeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        val intentD6 = Intent(this, MainDadod6::class.java)

        buttonD6.setOnClickListener{
            startActivity(intentD6)
        }

        val buttonD12 = findViewById<Button>(R.id.buttonD12)

        val intentD12 = Intent(this, MainDadoD12::class.java)

        buttonD12.setOnClickListener{
            startActivity(intentD12)
        }

        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        val intentD20 = Intent(this, MainDadoD20::class.java)

        buttonD20.setOnClickListener{
            startActivity(intentD20)
        }



    }

}

