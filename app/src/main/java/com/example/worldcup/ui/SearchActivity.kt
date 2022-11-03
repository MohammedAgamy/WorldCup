package com.example.worldcup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.worldcup.R
import com.example.worldcup.databinding.ActivitySearchBinding

class SearchActivity : BaseActivity<ActivitySearchBinding>(){

    override val bidingInFlatr: (LayoutInflater) -> ActivitySearchBinding = ActivitySearchBinding::inflate


    override val TAG: String? = "SearchActivity"

    override fun setUp() {
    }

    override fun addCallBack() {
    }
}

