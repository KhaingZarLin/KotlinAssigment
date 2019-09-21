package com.example.kotlinassigment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinassigment.adapter.ActorInfoAdapter
import kotlinx.android.synthetic.main.activity_movie_detial.*

class MovieDetialActivity : AppCompatActivity() {

    private lateinit var actorInfoAdapter: ActorInfoAdapter


    val EXTRA_ID_EXTRA = "movieId"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detial)

        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        detail_recyclerview.layoutManager = linearLayoutManager

        actorInfoAdapter = ActorInfoAdapter()
        detail_recyclerview.adapter = actorInfoAdapter

    }

}
