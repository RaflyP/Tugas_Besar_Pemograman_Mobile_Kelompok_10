package com.example.tugasbesarpemogramanmobilekelompok10

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class RegisterPage : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance().getReference("Users")

        val emailField = findViewById<EditText>(R.id.email)
        val passwordField = findViewById<EditText>(R.id.password)
        val fullNameField = findViewById<EditText>(R.id.nama_lengkap)
        val birthDateField = findViewById<EditText>(R.id.tanggal_lahir)
        val genderField = findViewById<EditText>(R.id.gender)
        val signUpButton = findViewById<Button>(R.id.signUpButton)

        signUpButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()
            val fullName = fullNameField.text.toString()
            val birthDate = birthDateField.text.toString()
            val gender = genderField.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && fullName.isNotEmpty() && birthDate.isNotEmpty() && gender.isNotEmpty()) {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val userId = auth.currentUser?.uid
                            val user = User(fullName, birthDate, gender, email)

                            if (userId != null) {
                                database.child("Users").child(userId).setValue(user)
                                    .addOnCompleteListener { dbTask ->
                                        if (dbTask.isSuccessful) {
                                            Toast.makeText(
                                                this,
                                                "Sign Up Successful!",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                            val intent = Intent(
                                                this@RegisterPage,
                                                LoginPage::class.java
                                            )
                                            startActivity(intent)
                                            finish()
                                        } else {
                                            Toast.makeText(
                                                this,
                                                "Failed to save user data.",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                        }
                                    }
                            }
                        } else {
                            Toast.makeText(
                                this,
                                "Sign Up Failed: ${task.exception?.message}",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    data class User(val fullName: String, val birthDate: String, val gender: String, val email: String)
}