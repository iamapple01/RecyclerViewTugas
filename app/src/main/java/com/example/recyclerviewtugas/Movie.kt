package com.example.recyclerviewtugas

var movieList = mutableListOf<Movie>()

val MOVIE_ID_EXTRA = "movieExtra"

class Movie (
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    val id: Int? = movieList.size
)