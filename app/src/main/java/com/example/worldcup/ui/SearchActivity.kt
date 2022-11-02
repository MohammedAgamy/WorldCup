package com.example.worldcup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldcup.R
import com.example.worldcup.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    lateinit var mSearchBinding:ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mSearchBinding=ActivitySearchBinding.inflate(layoutInflater)
        setContentView(mSearchBinding.root)
    }
}