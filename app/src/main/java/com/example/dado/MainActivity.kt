package com.example.dado

import android.os.Bundle
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
    }

    fun dado() {

        binding.tvBoton.setOnClickListener {
            when (Random.nextInt(6)) {
                1 -> {
                    binding.ivDado.setImageResource(R.drawable.dice_1)
                }
                2 -> {
                    binding.ivDado.setImageResource(R.drawable.dice_2)
                }
                3 -> {
                    binding.ivDado.setImageResource(R.drawable.dice_3)

                }
                4 -> {
                    binding.ivDado.setImageResource(R.drawable.dice_4)

                }
                5 -> {
                    binding.ivDado.setImageResource(R.drawable.dice_5)
                }
                else -> {
                    binding.ivDado.setImageResource(R.drawable.dice_6)

                }
            }
        }
    }

    fun segundoDadoSoproPAto() {
        //Sopro guei
    }
}
