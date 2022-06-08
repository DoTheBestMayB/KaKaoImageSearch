package com.github.dodobest.kakaoimagesearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.dodobest.kakaoimagesearch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}