package com.example.activity2activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity2activity.databinding.Activity2Binding
import com.example.activity2activity.databinding.ActivityMainBinding

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        binding = Activity2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        init()
    }


    @SuppressLint("SetTextI18n")
    fun init(){

        binding.textName.text="${intent.getStringExtra("name")} ${intent.getStringExtra("surname")}"
        binding.textAge.text=" ${intent.getStringExtra("age")} years old"
        binding.textJob.text=intent.getStringExtra("job")


    }



}