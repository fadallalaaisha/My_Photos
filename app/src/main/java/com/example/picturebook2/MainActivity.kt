package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnNext1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next1()
    }
    fun next1(){
        btnNext1=findViewById(R.id.btnNext1)

        btnNext1.setOnClickListener {
          var next = Intent(baseContext,pic2::class.java)
            startActivity(next)
        }
    }
}