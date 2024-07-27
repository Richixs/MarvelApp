package com.scesi.marvelapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.scesi.marvelapp.controller.HttpRequest
import com.scesi.marvelapp.databinding.ActivityMainBinding
import com.scesi.marvelapp.model.Comic
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageUrl = "https://i.pinimg.com/originals/47/66/90/4766903b6f3a64cfa29f73286f64d6c2.jpg"
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(binding.imageView)
    }
}