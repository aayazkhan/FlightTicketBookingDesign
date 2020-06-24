package com.aayaz.flightticketbookingdesign

data class Airport(
    var sortName: String,
    var code: String,
    var fullName: String
)

data class RecentSearch(
    var fromAirport: Airport,
    var toAirport: Airport,
    var passendgerCounter: Int,
    var travelDate: String
)