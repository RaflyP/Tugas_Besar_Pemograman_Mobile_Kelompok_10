package com.example.tugasbesarpemogramanmobilekelompok10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginPage : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        auth = FirebaseAuth.getInstance()

        val emailField = findViewById<EditText>(R.id.email)
        val passwordField = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val registerLink = findViewById<TextView>(R.id.registerLink)

        loginButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this@LoginPage, TampilProfile::class.java)
                            intent.putExtra("key_email", email)
                            startActivity(intent)
                            finish()
                        } else {
                            Toast.makeText(this, "Login Gagal: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(this, "Isi email dan password.", Toast.LENGTH_SHORT).show()
            }
        }

        registerLink.setOnClickListener {
            val intent = Intent(this@LoginPage, RegisterPage::class.java)
            startActivity(intent)
        }
    }
}