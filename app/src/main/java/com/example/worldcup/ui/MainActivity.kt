package com.example.worldcup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.worldcup.R
import com.example.worldcup.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.Buffer

class MainActivity :BaseActivity<ActivityMainBinding>(){

    override val TAG: String? = "mainActivity"
    override val bidingInFlatr: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setUp() {
    }

    override fun addCallBack() {
    }

    fun openFile()
    {
        val inPutStream=assets.open("worldcup.csv")
        val buffer=BufferedReader(InputStreamReader(inPutStream))

        buffer.forEachLine { Log.e("main" , it) }
    }
}