package com.panjidwisatrio.noyu.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.panjidwisatrio.noyu.DetailActivity
import com.panjidwisatrio.noyu.DetailActivity.Companion.USER
import com.panjidwisatrio.noyu.adapter.ListMovieAdapter
import com.panjidwisatrio.noyu.data.MovieData
import com.panjidwisatrio.noyu.databinding.FragmentMovieBinding
import com.panjidwisatrio.noyu.model.Movie
import com.panjidwisatrio.noyu.model.MovieIntent

class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding
    private var list :ArrayList<Movie> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.addAll(MovieData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        val listMovieAdapter = ListMovieAdapter(list)
        with(binding.rvMovie) {
            setHasFixedSize(true)
            adapter = listMovieAdapter
        }

        listMovieAdapter.setOnItemClickCallback(object : ListMovieAdapter.OnItemClickCallback {
            override fun onItemClickCallback(data: Movie) {
                setupRecyclerView(data)
            }
        })
    }

    private fun setupRecyclerView(movie: Movie) {

        val movieIntent = MovieIntent(
            title = movie.title,
            usia = movie.usia,
            reference = movie.reference,
            genre = movie.genre,
            tahun = movie.tahun,
            rating = movie.rating,
            sinopsis = movie.sinopsis,
            thumbnail = movie.thumbnail,
            aktor = movie.aktor,
            name = movie.name
        )
        startActivity(
            Intent(activity, DetailActivity::class.java)
                .putExtra(USER, movieIntent)
        )
    }
}