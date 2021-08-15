package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class pic2 : AppCompatActivity() {

    lateinit var btnBack2:Button
    lateinit var btnNext2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic2)
        click()
    }
    fun click(){
        btnBack2= findViewById(R.id.btnBack2)
        btnNext2= findViewById(R.id.btnNext2)

        btnBack2.setOnClickListener {
            var back= Intent(baseContext,MainActivity::class.java)
            startActivity(back)
        }
        btnNext2.setOnClickListener {
            var next = Intent(baseContext,pic3::class.java)
            startActivity(next)
        }
    }
}