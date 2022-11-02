package com.example.worldcup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldcup.R
import com.example.worldcup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}