package com.example.recyclerviewtugas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtugas.databinding.CardCellBinding

class CardAdapter (
    private val movies: List<Movie>,
    private val clickListener: MovieClickListener)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent,false)
        return CardViewHolder(binding, clickListener)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindMovie(movies[position])
    }
}