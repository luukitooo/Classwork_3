package com.example.classwork_3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.classwork_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val preferenceAdapter by lazy { PreferenceAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buildRecycler(this)

    }

    private fun buildRecycler(context: Context) {
        binding.preferencesList.apply {
            adapter = preferenceAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }

}