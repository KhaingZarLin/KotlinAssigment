package com.example.kotlinassigment

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinassigment.adapter.ActorInfoAdapter
import com.example.kotlinassigment.data.vos.MovieVO
import kotlinx.android.synthetic.main.activity_movie_detial.*

class MovieDetialActivity : BaseActivity() {

    private lateinit var actorInfoAdapter: ActorInfoAdapter


    val EXTRA_ID_EXTRA = "movieId"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detial)

        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        detail_recyclerview.layoutManager = linearLayoutManager

        actorInfoAdapter = ActorInfoAdapter()
        detail_recyclerview.adapter = actorInfoAdapter

        val movieId=intent.getIntExtra(MovieDetialActivity.EXTRA_Movie_ID,0)
        if (movieId!=0)
        {
            val movieVO=model.getMovieById(movieId)
            bindData(movieVO)
        }
    }
    private fun bindData(movieVO:MovieVO)
    {
        txt_mov_title.text=movieVO.movie_name
    }

    companion object{
        const val EXTRA_Movie_ID="eventIdExtra"

        fun newIntent(context: Context, movieId:Int): Intent {
//            val intent=Intent(context,EventDetailActivity::class.java)
//            intent.putExtra(EXTRA_EVENT_ID,eventId)
//            return intent

            return Intent(context,MovieDetialActivity::class.java).apply {
                putExtra(EXTRA_Movie_ID,movieId)
            }

        }
    }

}
