package com.example.tugasbesarpemogramanmobilekelompok10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Kalkulasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kalkulasi)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val umur = findViewById<EditText>(R.id.IdUmur)
        val BB_anak = findViewById<EditText>(R.id.IdBeratBadan)
        val BtnJumlah = findViewById<Button>(R.id.IdBtnJumlah)
        val tvHasil = findViewById<TextView>(R.id.IdHasil)
        val BtnBmI = findViewById<Button>(R.id.IdBtnBmI)
        val BtnTamProl = findViewById<Button>(R.id.IdBtnTamProl)
        val BtnKal = findViewById<Button>(R.id.IdBtnKal)

        BtnBmI.setOnClickListener {
            val intent = Intent(this, BMI::class.java)
            startActivity(intent)
        }
        BtnKal.setOnClickListener {
            val intent = Intent(this, BMI::class.java)
            startActivity(intent)
        }

        BtnTamProl.setOnClickListener {
            val intent = Intent(this, TampilProfile::class.java)
            startActivity(intent)
        }
        findViewById<RadioGroup>(R.id.IdPilihan).setOnCheckedChangeListener { group, checkedId ->

            when(checkedId){
                R.id.IdLaki_kaki -> {
                    BtnJumlah.setOnClickListener {
                        val Berat_anak = BB_anak.text.toString().toFloat()
                        val Umur_anak = umur.text.toString().toInt()
                        if (Umur_anak == 0){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 1){
                            val Berat_median = 4.5
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-3.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(5.1-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 2){
                            val Berat_median = 5.6
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-4.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(6.3-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 3){
                            val Berat_median = 6.4
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-5.7)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(7.2-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 4){
                            val Berat_median = 7.0
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-6.2)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(7.8-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 5){
                            val Berat_median = 7.5
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-6.7)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(8.4-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 6){
                            val Berat_median = 7.9
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-7.1)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(8.8-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 7){
                            val Berat_median = 8.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-7.4)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(9.2-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 8){
                            val Berat_median = 8.6
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-7.7)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(9.6-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 9){
                            val Berat_median = 8.9
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-8.0)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(9.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 10){
                            val Berat_median = 9.2
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-8.2)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(10.2-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 11){
                            val Berat_median = 9.4
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-8.4)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(10.5-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 12){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 13){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 14){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 15){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 16){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 17){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 18){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 19){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 20){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 21){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 22){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 23){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 24){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 25){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 26){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 27){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 28){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 29){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 30){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 31){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 32){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 33){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 34){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 35){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 36){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 37){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 38){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 39){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 40){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 41){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 42){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 43){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 44){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 45){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 46){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 47){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 48){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 49){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 50){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 51){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 52){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 53){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 54){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 55){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 56){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 57){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 58){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 59){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 60){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                    }
                }
                R.id.IdPerempuan -> {
                    BtnJumlah.setOnClickListener {
                        val Berat_anak = BB_anak.text.toString().toFloat()
                        val Umur_anak = umur.text.toString().toInt()
                        if (Umur_anak == 0){
                            val Berat_median = 3.2
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.8)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.7-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 1){
                            val Berat_median = 4.2
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-3.6)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(4.8-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 2){
                            val Berat_median = 5.1
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-4.5)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(5.8-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 3){
                            val Berat_median = 5.8
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-5.2)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(6.6-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 4){
                            val Berat_median = 6.4
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-5.7)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(7.3-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 5){
                            val Berat_median = 6.9
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-6.1)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(7.8-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 6){
                            val Berat_median = 7.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-6.5)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(8.2-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 7){
                            val Berat_median = 7.6
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-6.8)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(8.6-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 8){
                            val Berat_median = 7.9
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-7.0)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(9.0-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 9){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 10){
                            val Berat_median = 8.2
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-7.3)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(9.3-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 11){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 12){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 13){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 14){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 15){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 16){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 17){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 18){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 19){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 20){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 21){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 22){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 23){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 24){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 25){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 26){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 27){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 28){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 29){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 30){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 31){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 32){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 33){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 34){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 35){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 36){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 37){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 38){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 39){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 40){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 41){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 42){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 43){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 44){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 45){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 46){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 47){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 48){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 49){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 50){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 51){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 52){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 53){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 54){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 55){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 56){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 57){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 58){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 59){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                        if (Umur_anak == 60){
                            val Berat_median = 3.3
                            if (Berat_anak < Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(Berat_median-2.9)
                                tvHasil.setText("Hasil : $hasil")
                            }
                            if (Berat_anak > Berat_median){
                                val hasil = (Berat_anak-Berat_median)/(3.9-Berat_median)
                                tvHasil.setText("Hasil : $hasil")
                            }
                        }
                    }
                }

            }
        }
    }
}