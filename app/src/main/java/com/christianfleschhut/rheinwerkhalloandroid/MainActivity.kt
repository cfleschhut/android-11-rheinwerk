package com.christianfleschhut.rheinwerkhalloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var message: TextView
    private lateinit var nextFinish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message = findViewById(R.id.message)
        nextFinish = findViewById(R.id.next_finish)

        message.setText(R.string.welcome)
        nextFinish.setText(R.string.next)
    }
}