package com.example.tugasbesarpemogramanmobilekelompok10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class BMI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bmi)

        val Berat_dewasa = findViewById<EditText>(R.id.IdBD)
        val Tinggi_dewasa = findViewById<EditText>(R.id.IdTD)
        val BtnJum = findViewById<Button>(R.id.IdBtnJum)
        val tvHsil = findViewById<TextView>(R.id.IdHsil)
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
        BtnJum.setOnClickListener {
            val BeratD = Berat_dewasa.text.toString().toFloatOrNull()
            val TinggiD = Tinggi_dewasa.text.toString().toFloatOrNull()

            if (BeratD != null && TinggiD != null) {
                val hsil = BeratD / (TinggiD * TinggiD)

                if (hsil < 18.5) {
                    tvHsil.text = "Berat badan kurang"
                } else if (hsil in 18.5..22.9) {
                    tvHsil.text = "Berat badan normal"
                } else if (hsil in 23.0..29.9) {
                    tvHsil.text = "Berat badan berlebih (kecenderungan obesitas)"
                } else if (hsil >= 30) {
                    tvHsil.text = "Obesitas"
                } else {
                    tvHsil.text = "Error"
                }
            } else {
                tvHsil.text = "Please enter valid numbers"
            }
        }
    }
}