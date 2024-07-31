package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class morbi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_morbi)
        var bt: Button = findViewById(R.id.button)
        bt.setOnClickListener {
            onBackPressed()
        }
    }
}