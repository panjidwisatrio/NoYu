package com.panjidwisatrio.noyu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.panjidwisatrio.noyu.databinding.ActivityDetailBinding
import com.panjidwisatrio.noyu.model.Movie
import com.panjidwisatrio.noyu.model.MovieIntent

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val USER = "user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if(intent.hasExtra(USER)) {
            val user = intent.getParcelableExtra<MovieIntent>(USER) as MovieIntent

            binding.tvJudulDetail.text = user.title
            binding.tvNamaDetail.text = user.name
            binding.tvUsiaDetail.text = user.usia
            binding.tvGenreDetail.text = user.genre
            binding.tvTahunDetail.text = user.tahun
            binding.tvRatingDetail.text = user.rating
            binding.tvSinopsisDetail.text = user.sinopsis
            binding.tvReferenceDetail.text = user.reference

            binding.ivPhotoDetail.setImageResource(user.thumbnail)
            binding.ivAktorDetail.setImageResource(user.aktor)

            binding.tvReferenceDetail.setOnClickListener {
                val reference = Intent(Intent.ACTION_VIEW)
                reference.data = Uri.parse(user.reference)
                startActivity(reference)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.share_menu) {
            val user = intent.getParcelableExtra<MovieIntent>(USER) as MovieIntent
            val myIntent = Intent(Intent.ACTION_SEND)
            myIntent.type = "type/plain"
            myIntent.putExtra(Intent.EXTRA_TEXT,
                "Nama Film: " + user.title + "\n" + "Sinopsis: " + user.sinopsis + "\n" +
                        "Referensi: " + user.reference
            )
            startActivity(Intent.createChooser(myIntent, "Share Your App"))
        }
        return super.onOptionsItemSelected(item)
    }
}