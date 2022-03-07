package com.panjidwisatrio.noyu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.panjidwisatrio.noyu.databinding.ActivityMainBinding
import com.panjidwisatrio.noyu.ui.FragmentHome
import com.panjidwisatrio.noyu.ui.MovieFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val FragmentHome = FragmentHome()
    private val MovieFragment = MovieFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        currentPage(FragmentHome)

        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.page_1 -> {
                    currentPage(FragmentHome)
                }
                R.id.page_2 -> {
                    currentPage(MovieFragment)
                }
            }
            true
        }
    }

    private fun currentPage(fragment : Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.container, fragment)
        commit()
    }
}