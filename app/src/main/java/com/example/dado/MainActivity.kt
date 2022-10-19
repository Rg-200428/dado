package com.example.dado

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toDrawable
import com.example.dado.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        dado()
        segundoDado()
    }

    fun dado() {

        binding.tvTirarDado.setOnClickListener {
            when (Random.nextInt(6)) {
                1 -> binding.ivDadoImage.setImageResource(R.drawable.dice_1)
                2 -> binding.ivDadoImage.setImageResource(R.drawable.dice_2)
                3 -> binding.ivDadoImage.setImageResource(R.drawable.dice_3)
                4 -> binding.ivDadoImage.setImageResource(R.drawable.dice_4)
                5 -> binding.ivDadoImage.setImageResource(R.drawable.dice_5)
                else -> binding.ivDadoImage.setImageResource(R.drawable.dice_6)
            }
            when (Random.nextInt(6)) {
                1 -> binding.ivDadoImage2.setImageResource(R.drawable.dice_1)
                2 -> binding.ivDadoImage2.setImageResource(R.drawable.dice_2)
                3 -> binding.ivDadoImage2.setImageResource(R.drawable.dice_3)
                4 -> binding.ivDadoImage2.setImageResource(R.drawable.dice_4)
                5 -> binding.ivDadoImage2.setImageResource(R.drawable.dice_5)
                else -> binding.ivDadoImage2.setImageResource(R.drawable.dice_6)
            }
        }
    }

    fun segundoDado() {
        binding.tvOtroDado.setOnClickListener() {
                binding.ivDadoImage2.setVisibility(View.VISIBLE)
                binding.tvQuitar.setVisibility(View.VISIBLE)
                binding.tvOtroDado.setVisibility(View.INVISIBLE)
            }
        binding.tvQuitar.setOnClickListener(){
            binding.ivDadoImage2.setVisibility(View.INVISIBLE)
            binding.tvQuitar.setVisibility(View.INVISIBLE)
            binding.tvOtroDado.setVisibility(View.VISIBLE)

     }
    }
}
