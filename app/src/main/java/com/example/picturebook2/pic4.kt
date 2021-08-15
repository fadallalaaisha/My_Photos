package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic4 : AppCompatActivity() {
    lateinit var btnBack4:Button
    lateinit var btnNext4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic4)

        btnBack4=findViewById(R.id.btnBack4)
        btnNext4=findViewById(R.id.btnNext4)

        btnNext4.setOnClickListener {
            var next=Intent(baseContext,pic5::class.java)
            startActivity(next)
        }
        btnBack4.setOnClickListener {
            var back=Intent(baseContext,pic3::class.java)
            startActivity(back)
        }
    }
}