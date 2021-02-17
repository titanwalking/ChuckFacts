package com.colossussoftware.chuckfacts.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.colossussoftware.chuckfacts.R
import com.colossussoftware.chuckfacts.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonNext.setOnClickListener { viewModel.getRemoteRandomJoke() }
        subscribeToObservers()
    }

    private fun subscribeToObservers() {
        viewModel.joke.observe(this, { binding.joke = it })
    }
}