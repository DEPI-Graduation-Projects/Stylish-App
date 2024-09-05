package com.example.stylish.ui.main.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.stylish.R
import com.example.stylish.data.local.Repository
import com.example.stylish.databinding.ActivityMainBinding
import com.example.stylish.ui.main.adapter.ProductAdapter
import com.example.stylish.ui.main.view_model.MainViewModel

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

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