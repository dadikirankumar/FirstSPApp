package com.emonics.firstspapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var prefHelper: PrefHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        prefHelper = PrefHelper(this)

        Log.d("Emonics", "New Change 2")
        Log.d("Emonics", "New branch created")

        val textView = findViewById<TextView>(R.id.textView)
        textView.setText("${prefHelper.getString("NAME")} - ${prefHelper.getInt("ID")}")
    }
}