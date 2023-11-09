package com.example.contacts

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = findViewById<TextView>(R.id.name)
        val phone = findViewById<TextView>(R.id.phone_number)
        val gmail = findViewById<TextView>(R.id.gmail)

        try {
            val nameParam = intent.getStringExtra("name")
            val phoneParam = intent.getStringExtra("phone")
            val gmailParam = intent.getStringExtra("gmail")

            name.text = nameParam
            phone.text = phoneParam
            gmail.text = gmailParam

        } catch (ex: Exception) {
            Toast.makeText(this, "Load data Failed!" , Toast.LENGTH_SHORT).show()
            setResult(Activity.RESULT_CANCELED)
        }
    }
}