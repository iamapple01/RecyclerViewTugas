package com.example.recyclerviewtugas

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtugas.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: MovieClickListener
) : RecyclerView. ViewHolder(cardCellBinding.root)
{
    fun bindMovie(movie: Movie){
        cardCellBinding.cover.setImageResource(movie.cover)
        cardCellBinding.title.text = movie.title
        cardCellBinding.author.text = movie.author

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(movie)
        }
    }
}