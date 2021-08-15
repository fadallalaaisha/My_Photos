package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic5 : AppCompatActivity() {
    lateinit var btnBack:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic5)

        btnBack=findViewById(R.id.btnBack)

        btnBack.setOnClickListener {
            var back= Intent(baseContext,pic4::class.java)
            startActivity(back)
        }
    }
}