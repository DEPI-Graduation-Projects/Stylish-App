package com.example.stylish.ui.main.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.stylish.R
import com.example.stylish.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO: go to profile page
//        binding.toolbar.appbar.setOnMenuItemClickListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.user -> {
//                    val intent = Intent(this, ::class.java)
//                    startActivity(intent)
//                    true
//                }
//                else -> false
//            }
//        }

        binding.toolbar.appbar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }
    }
}