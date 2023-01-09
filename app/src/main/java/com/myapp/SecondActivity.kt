package com.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        getAndShowName()
        btnBack.setOnClickListener { onBackPressed() }
    }

    fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("name")
        txtCongratulation.text = getString(R.string.congratulation, name)
    }
}