package com.example.daggaauth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mylibrary.DaggAuth

class MainActivity : AppCompatActivity() {
    lateinit var daggAuth: DaggAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        daggAuth = DaggAuth()
        Toast.makeText(this, daggAuth.hello("Henri"), Toast.LENGTH_SHORT).show()
    }
}