package com.example.kotlinassigment.view.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlinassigment.data.vos.MovieVO
import com.example.kotlinassigment.delegate.FragmentDelegateOne
import kotlinx.android.synthetic.main.item_view.view.*


class MovieCollectionViewHolder(itemView: View, private val itemClicked: FragmentDelegateOne) :
    BaseViewHolder<MovieVO>(itemView) {

    init {
        itemView.setOnClickListener {
            val id = data?.id
            if (id != null){
                itemClicked.onClicked(id)
            }

        }
    }
    override fun bindData(data: MovieVO) {

        itemView.txt_mov_title.text = data.movie_name
        itemView.txt_show_time.text = data.imdb.toString()
        itemView.rate_decimal.text = data.rotten_tomato.toString()
        itemView.txt_percent1.text = data.meta_centric.toString()
        Glide.with(itemView).load(data.poster).into(itemView.movie_image)
    }
}
