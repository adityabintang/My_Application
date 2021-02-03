package com.myApplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO: sembunyikan tvAgeResult
        tvAgeResult.visibility = View.INVISIBLE

        //TODO: Beri event klik ke button
        btnFindAge.setOnClickListener {
            //mendapatkan tahun saat ini
            val currYear = Calendar.getInstance().get(Calendar.YEAR)

            //TODO: Hitung(Tahun ini - tahun lahir)
            val userAge = currYear - etBirthYear.text.toString().toInt()

            //TODO: Set Hasil ke text view
            tvAgeResult.text = "Your age is: $userAge years old"

            //TODO: tampilkan text result
            tvAgeResult.visibility = View.VISIBLE
        }
    }
}