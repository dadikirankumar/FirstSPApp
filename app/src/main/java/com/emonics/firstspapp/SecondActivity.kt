package com.emonics.firstspapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var prefHelper: PrefHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        prefHelper = PrefHelper(this)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "${prefHelper.getString("NAME")} - ${prefHelper.getInt("ID")}"
    }
}