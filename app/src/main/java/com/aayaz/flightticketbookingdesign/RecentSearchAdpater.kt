package com.aayaz.flightticketbookingdesign

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecentSearchAdpater(private val recentSearchList: ArrayList<RecentSearch>) :
    RecyclerView.Adapter<RecentSearchHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentSearchHolder {
        val inflater = LayoutInflater.from(parent.context)
        return RecentSearchHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return recentSearchList.size
    }

    override fun onBindViewHolder(holder: RecentSearchHolder, position: Int) {
        val movie: RecentSearch = recentSearchList[position]
        holder.bind(movie)
    }
}