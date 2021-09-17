package com.zen4r17.loginapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // lateinit var btn_login: Button
    lateinit var til_username: TextView
    lateinit var til_password: TextView
    lateinit var et_username: EditText
    lateinit var tv_register: TextView
    lateinit var et_password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin: Button = findViewById(R.id.btn_login)

        btnLogin.setOnClickListener {

            if (et_username.text.trim().isNotEmpty() || et_password.text.trim().isNotEmpty()) {

                Toast.makeText(this, "Input provided", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Input required", Toast.LENGTH_LONG).show()
            }

        }

        val tvRegister: TextView = findViewById(R.id.tv_register)
        tvRegister.setOnClickListener {

            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}