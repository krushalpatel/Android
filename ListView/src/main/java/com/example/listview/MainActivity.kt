package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView : ListView = findViewById(R.id.listView)
        var city = arrayOf("Morbi","Rajkot","Surat","Jamnagar","Vadodra")
        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city)
        listView.adapter =  adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            var value = listView.getItemAtPosition(i).toString()

            if (value == "Rajkot")
            {
                var rjk = Intent(this,rajkot::class.java)
                startActivity(rjk);
            }
            else if (value == "Morbi")
            {
                var mor = Intent(this,morbi::class.java)
                startActivity(mor)
            }
            else if (value == "Surat")
            {
                var sur = Intent(this,surat::class.java)
                startActivity(sur)
            }
            else if (value == "Jamnagar")
            {
                var jam = Intent(this,jamnagar::class.java)
                startActivity(jam)
            }
            else
            {
                var vad = Intent(this,vadodra::class.java)
                startActivity(vad)
            }


        }
    }
}