package com.my_universe_busantour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.my_universe_busantour.databinding.ActivityWishBinding

class WishActivity : AppCompatActivity() {
    lateinit var binding: ActivityWishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWishBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}


