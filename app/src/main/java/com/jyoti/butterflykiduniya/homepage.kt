package com.jyoti.butterflykiduniya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)


        val detailsdisco = findViewById<Button>(R.id.detailsdisco);
        detailsdisco.setOnClickListener{
         val Intent = Intent(this, Activitydiscophora::class.java)
         startActivity(Intent)
        }
        }
    }
