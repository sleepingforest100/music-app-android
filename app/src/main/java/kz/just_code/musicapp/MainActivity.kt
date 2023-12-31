package kz.just_code.musicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kz.just_code.musicapp.databinding.ActivityMainBinding
import kz.just_code.musicapp.databinding.FragmentUserBinding


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

        // Найти NavController
        navController = findNavController(R.id.nav_host_fragment)

        // Настроить Bottom Navigation с NavController
        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavView.setupWithNavController(navController)
//languages

    }
}