package com.example.chainsawman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chainsawman.adapter.CharacterAdapter
import com.example.chainsawman.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleView()

    }
    private fun initRecycleView(){

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.adapter=CharacterAdapter(CharacterProvider.characterList)
    }

}