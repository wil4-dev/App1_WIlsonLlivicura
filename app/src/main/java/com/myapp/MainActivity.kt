package com.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

// @autor Wilson Llivicura
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart.setOnClickListener { checkValue() }
    }

    fun checkValue(){
        if(intxtName.text.toString().isEmpty()){
            Toast.makeText(this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show()
        }else{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", intxtName.text.toString())
            startActivity(intent)
        }
    }
}