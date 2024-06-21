package com.example.tugasbesarpemogramanmobilekelompok10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class TampilProfile : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil_profile)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance().reference

        val BtnKal = findViewById<Button>(R.id.IdBtnKal)
        val BtnBMI = findViewById<Button>(R.id.IdBtnBmI)
        val BtnTamProl = findViewById<Button>(R.id.IdBtnTamProl)

        BtnKal.setOnClickListener {
            val intent = Intent(this, Kalkulasi::class.java)
            startActivity(intent)
        }

        BtnBMI.setOnClickListener {
            val intent = Intent(this, BMI::class.java)
            startActivity(intent)
        }

        BtnTamProl.setOnClickListener {
            val intent = Intent(this, TampilProfile::class.java)
            startActivity(intent)
        }

        val userId = auth.currentUser?.uid

        if (userId != null) {
            database.child("Users").child(userId).addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.exists()) {
                        val user = snapshot.getValue(User::class.java)
                        val namaTextView = findViewById<TextView>(R.id.namaTextView)
                        namaTextView.text = user?.fullName ?: "Nama tidak ditemukan"
                    } else {
                        Toast.makeText(applicationContext, "Data pengguna tidak ditemukan", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    Toast.makeText(applicationContext, "Error: ${error.message}", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }

    data class User(
        val fullName: String? = null,
        val birthDate: String? = null,
        val gender: String? = null,
        val email: String? = null
    )
}