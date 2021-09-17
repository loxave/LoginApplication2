package com.zen4r17.loginapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    //private lateinit var tv_login: TextView
    private lateinit var tv_username: TextView
    private lateinit var tv_email: TextView
    private lateinit var tv_password: TextView
    private lateinit var tv_Cpassword: TextView
    private lateinit var edt_username: EditText
    private lateinit var edt_email: EditText
    private lateinit var edt_password: EditText
    private lateinit var edt_Cpassword: EditText
    //   private lateinit var btn_register: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister: Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener {

            if (edt_username.text.toString().trim()
                    .isNotEmpty() || edt_email.text.isNotEmpty() || edt_Cpassword.text.toString()
                    .isNotEmpty()
                || edt_password.text.toString().isNotEmpty()
            ) {

                Toast.makeText(this, "Input Provided", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Input Required", Toast.LENGTH_SHORT).show()
            }
        }

        val tvLogin: TextView = findViewById(R.id.tv_login)
        tvLogin.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}