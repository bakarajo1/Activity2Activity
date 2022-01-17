package com.example.activity2activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity2activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        init()
    }


    fun init(){

        listeners()
    }

    fun listeners(){

        binding.button.setOnClickListener {
            val person=Person( binding.editTextTextPersonName.text.toString(), binding.editTextTextPersonSurname.text.toString(),binding.editTextTextPersonAge.text.toString().toInt(),binding.editTextTextPersonJob.text.toString())
            val intent =  Intent(this,Activity2::class.java)

            intent.putExtra("person", person)
            startActivity(intent)

        }


    }
}