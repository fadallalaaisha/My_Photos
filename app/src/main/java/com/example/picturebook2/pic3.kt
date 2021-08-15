package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.time.Instant

class pic3 : AppCompatActivity() {

    lateinit var btnBack3:Button
    lateinit var btnNext3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic3)

        click()
    }
    fun click(){
        btnBack3=findViewById(R.id.btnBack3)
        btnNext3=findViewById(R.id.btnNext3)

        btnNext3.setOnClickListener {
            var next = Intent(baseContext,pic4::class.java)
            startActivity(next)
        }
        btnBack3.setOnClickListener {
            var back = Intent(baseContext,pic2::class.java)
            startActivity(back)
        }
    }
}