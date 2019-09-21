package com.example.kotlinassigment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinassigment.R
import com.example.kotlinassigment.view.holder.ActorInfoViewHolder

class ActorInfoAdapter: RecyclerView.Adapter<ActorInfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorInfoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.actor_info_view, parent, false)
        return ActorInfoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ActorInfoViewHolder, position: Int) {

    }
}