package com.example.worldcup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.worldcup.R
import com.example.worldcup.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.Buffer

class MainActivity : AppCompatActivity() {
    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openFile()
    }



    fun openFile()
    {
        val inPutStream=assets.open("worldcup.csv")
        val buffer=BufferedReader(InputStreamReader(inPutStream))

        buffer.forEachLine { Log.e("main" , it) }
    }
}