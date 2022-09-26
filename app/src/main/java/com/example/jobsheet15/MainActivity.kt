package com.example.jobsheet15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText( this, "aplikasi berjalan", Toast.LENGTH_SHORT).show()

        val nama = findViewById<Button>(R.id.nama)
        val kelas = findViewById<Button>(R.id.kelas)
        val nis = findViewById<Button>(R.id.nis)

        nama.setOnClickListener{
            Toast.makeText( this, "Sahrul Lukman Hakim", Toast.LENGTH_SHORT).show()
        }
        kelas.setOnClickListener{
            Toast.makeText( this, "XI PPLG 1", Toast.LENGTH_SHORT).show()
        }
        nis.setOnClickListener{
            Toast.makeText( this, "3027", Toast.LENGTH_SHORT).show()
        }


    }
}