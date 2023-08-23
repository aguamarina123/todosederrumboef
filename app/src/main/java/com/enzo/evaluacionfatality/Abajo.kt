package com.enzo.evaluacionfatality

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.enzo.evaluacionfatality.databinding.ActivityAbajoBinding
import androidx.navigation.ui.setupWithNavController

class Abajo : AppCompatActivity() {

    private lateinit var binding: ActivityAbajoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAbajoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fcv_img) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bnvMenu.setupWithNavController(navController)
    }
}