package com.aayaz.flightticketbookingdesign

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recent_search_item_row.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = ArrayList<RecentSearch>()

        list.add(
            RecentSearch(
                Airport("New Delhi", "DEL", "Indira Gandhi International Airport"),
                Airport("Mumbai", "BOM", "Chhatrapati Shivaji Maharaj International Airport"),
                1, "25 May 20"
            )
        );

        list.add(
            RecentSearch(
                Airport("New Delhi", "DEL", "Indira Gandhi International Airport"),
                Airport("Mumbai", "BOM", "Chhatrapati Shivaji Maharaj International Airport"),
                1, "25 May 20"
            )
        );

//        recyclerViewRecentSearch.layoutManager  = LinearLayoutManager(this)
        recyclerViewRecentSearch.adapter = RecentSearchAdpater(list);


    }


}