package com.christianfleschhut.rheinwerkhalloandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private var firstClick = true

class MainActivity : AppCompatActivity() {

    private lateinit var message: TextView
    private lateinit var nextFinish: Button
    private lateinit var input: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message = findViewById(R.id.message)
        nextFinish = findViewById(R.id.next_finish)
        input = findViewById(R.id.input)

        message.setText(R.string.welcome)
        nextFinish.setText(R.string.next)

        nextFinish.setOnClickListener {
            if (firstClick) {
                message.text = getString(R.string.hello, input.text)
                input.visibility = View.INVISIBLE

                nextFinish.setText(R.string.finish)
                firstClick = false
            } else {
                finish()
            }
        }
    }
}