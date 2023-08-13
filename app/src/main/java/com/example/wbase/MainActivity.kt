package com.example.wbase

import android.view.LayoutInflater
import com.example.lib_base.base.BaseActivity
import com.example.wbase.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate


    override fun initView() {
        super.initView()

    }
}
