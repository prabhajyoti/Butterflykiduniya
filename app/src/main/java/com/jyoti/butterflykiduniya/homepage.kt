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
        detailsdisco.setOnClickListener {
            val Intent = Intent(this, Activitydiscophora::class.java)
            startActivity(Intent)
        }
        val detailsmormon = findViewById<Button>(R.id.detailsmormon);
        detailsmormon.setOnClickListener {
            val Intent = Intent(this, activitygreatmormon::class.java)
            startActivity(Intent)

        }
        val detailsjezebel = findViewById<Button>(R.id.detailsjezebel);
        detailsjezebel.setOnClickListener {
            val Intent = Intent(this, Activityjezebel::class.java)
            startActivity(Intent)
        }
        val detailsmalbar = findViewById<Button>(R.id.detailsmalbar);
        detailsmalbar.setOnClickListener {
            val Intent = Intent(this, Activitymalbarrose::class.java)
            startActivity(Intent)
        }
        val detailsgorgon = findViewById<Button>(R.id.detailsgorgon);
        detailsgorgon.setOnClickListener {
            val Intent = Intent(this, Activityyellowgorgon::class.java)
            startActivity(Intent)
        }

    }
}

