package com.emonics.firstspapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var prefHelper: PrefHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prefHelper = PrefHelper(this)

        val button = findViewById<Button>(R.id.btnNext)

        Log.d("Emonics", "New Changes")

        prefHelper.put("NAME", "EMONICS")
        prefHelper.put("ID", 123)

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)

//            prefHelper.clear()
        }
    }
}