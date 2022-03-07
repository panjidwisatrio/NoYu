package com.panjidwisatrio.noyu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.panjidwisatrio.noyu.databinding.ItemRowMovieBinding
import com.panjidwisatrio.noyu.model.Movie

class ListMovieAdapter(private val listMovie : ArrayList<Movie>) :
    RecyclerView.Adapter<ListMovieAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback : OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClickCallback(data : Movie)
    }

    inner class ListViewHolder(private val binding: ItemRowMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(movie: Movie) {
                with(binding) {
                    Glide.with(this.root)
                        .load(movie.thumbnail)
                        .into(imgItemPhoto)

                    binding.tvItemTitle.text = movie.title
                    binding.tvItemUsia.text = movie.usia
                    binding.tvItemGenre.text = movie.genre
                    binding.tvItemRating.text = movie.rating
                    binding.tvItemSinopsis.text = movie.sinopsis
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
        ListViewHolder(
            ItemRowMovieBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listMovie[position])
        holder.itemView.setOnClickListener {onItemClickCallback.onItemClickCallback(listMovie[holder.adapterPosition])}
    }

    override fun getItemCount(): Int =listMovie.size
}