package com.panjidwisatrio.noyu.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.panjidwisatrio.noyu.adapter.ListMovieAdapter
import com.panjidwisatrio.noyu.data.MovieData
import com.panjidwisatrio.noyu.databinding.FragmentHomeBinding
import com.panjidwisatrio.noyu.model.Movie

class FragmentHome : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}