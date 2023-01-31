package com.example.chainsawman.adapter

import android.content.Intent;

import android.view.View

import android.widget.Toast


import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.chainsawman.CharacterActivity2
import com.example.chainsawman.databinding.ItemCharacterBinding


class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemCharacterBinding.bind(view)


    fun render(characterModel: com.example.chainsawman.Character) {
        binding.tvCharacter.text = characterModel.character
        Glide.with(binding.ivCharacter.context).load(characterModel.photo).into(binding.ivCharacter)
        binding.ivCharacter.setOnClickListener {
            Toast.makeText(
                binding.ivCharacter.context,
                characterModel.ability,
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.btnView.setOnClickListener(){
            val context=binding.btnView.context
            val intent = Intent(context, CharacterActivity2::class.java)
            intent.putExtra("letter",binding.btnView.text.toString())
            context.startActivity(intent)

        }

    }


}