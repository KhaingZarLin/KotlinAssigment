package com.example.kotlinassigment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.kotlinassigment.R
import com.example.kotlinassigment.data.vos.MovieVO
import com.example.kotlinassigment.delegate.FragmentDelegateOne
import com.example.kotlinassigment.view.holder.MovieCollectionViewHolder

class MovieAdapter(private val itemClicked: FragmentDelegateOne): BaseAdapter<MovieCollectionViewHolder, MovieVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCollectionViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MovieCollectionViewHolder(view, itemClicked)
    }
}