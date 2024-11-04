package com.example.recyclerviewtugas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerviewtugas.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieID = intent.getIntExtra(MOVIE_ID_EXTRA, -1)
        val movie = movieFromID(movieID)
        if (movie != null) {
            binding.cover.setImageResource(movie.cover)
            binding.title.text = movie.title
            binding.description.text = movie.description
            binding.author.text = movie.author
        }
    }

    private fun movieFromID(movieID: Int): Movie? {
        for (movie in movieList) {
            if (movie.id == movieID)
                return movie
        }
        return null
    }
}
