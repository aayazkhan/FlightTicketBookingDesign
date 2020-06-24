package com.aayaz.flightticketbookingdesign

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecentSearchHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recent_search_item_row, parent, false)) {

    private var textViewFromStation: TextView? = null
    private var textViewToStation: TextView? = null
    private var textViewPasengerCount: TextView? = null
    private var textViewTravelDate: TextView? = null

    init {
        textViewFromStation = itemView.findViewById(R.id.textViewFromStation)
        textViewToStation = itemView.findViewById(R.id.textViewToStation)
        textViewPasengerCount = itemView.findViewById(R.id.textViewPasengetCount)
        textViewTravelDate = itemView.findViewById(R.id.textViewTravelDate)
    }

    fun bind(recentSearch: RecentSearch) {
        textViewFromStation?.text = recentSearch.fromAirport.sortName
        textViewToStation?.text = recentSearch.toAirport.sortName
        textViewPasengerCount?.text = "${recentSearch.passendgerCounter} Adult"
        textViewTravelDate?.text = recentSearch.travelDate
    }

}