package com.example.kek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.search -> {
                    Toast.makeText(this, "здесь должен был быть переход, но не получается :(", Toast.LENGTH_SHORT).show()
                }
                R.id.heart -> {
                    Toast.makeText(this, "здесь должен был быть переход, но не получается :(", Toast.LENGTH_SHORT).show()
                }
                R.id.message -> {
                    Toast.makeText(this, "здесь должен был быть переход, но не получается :(", Toast.LENGTH_SHORT).show()
                }
                R.id.garage -> {
                    Toast.makeText(this, "здесь должен был быть переход, но не получается :(", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}