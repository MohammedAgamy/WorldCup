package com.example.worldcup.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    abstract val TAG:String?
    abstract val bidingInFlatr: (LayoutInflater) -> VB ///???
    private var _binding: ViewBinding? = null ///???
    protected val binding = _binding as VB  ///???

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bidingInFlatr(layoutInflater)
        setContentView(requireNotNull(_binding).root)
        setUp()
        addCallBack()

    }

    abstract fun setUp()
    abstract fun addCallBack()
    protected fun log(value: String) {
        Log.e(TAG, value)
    }

}

