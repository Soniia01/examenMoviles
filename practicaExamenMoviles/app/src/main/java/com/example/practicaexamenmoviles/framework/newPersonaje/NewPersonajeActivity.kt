package com.example.practicaexamenmoviles.framework.newPersonaje


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.practicaexamenmoviles.R
import com.example.practicaexamenmoviles.databinding.NewPersonajeBinding


class NewPersonajeActivity : AppCompatActivity(){
    private lateinit var binding: NewPersonajeBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NewPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        initNavigation()
    }

    private fun initNavigation() {
        val navHost = supportFragmentManager.findFragmentById(R.id.topAppBar) as NavHostFragment
        navController = navHost.navController
        binding.topAppBar.setupWithNavController(navController)
    }
}