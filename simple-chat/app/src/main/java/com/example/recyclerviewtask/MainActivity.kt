package com.example.recyclerviewtask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.senderDataList
import com.example.recyclerviewtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MyAdapter(senderDataList)
        binding.recyclerView.adapter = adapter

    }
}