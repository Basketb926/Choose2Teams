package com.example.choose2teams

import kotlin.random.Random

val LEAGUES = mapOf(
    "NBA" to listOf("Boston Celtics", "Los Angeles Lakers", "Golden State Warriors", "New York Knicks", "Dallas Mavericks", "Phoenix Suns", "Milwaukee Bucks", "Miami Heat"),
    "NFL" to listOf("Kansas City Chiefs", "Philadelphia Eagles", "Dallas Cowboys", "Green Bay Packers", "Baltimore Ravens", "San Francisco 49ers", "Miami Dolphins", "Detroit Lions"),
    "MLB" to listOf("New York Yankees", "Los Angeles Dodgers", "Atlanta Braves", "Boston Red Sox", "Houston Astros", "Chicago Cubs", "St. Louis Cardinals", "Texas Rangers"),
    "Premier League" to listOf("Arsenal", "Chelsea", "Manchester City", "Liverpool", "Tottenham Hotspur", "Manchester United", "Leicester City", "Everton"),
)

fun randomTeamsForLeague(leagueName: String): List<String> {
    val availableTeams = LEAGUES[leagueName].orEmpty()
    if (availableTeams.isEmpty()) return emptyList()

    return availableTeams.shuffled(Random(System.currentTimeMillis())).take(2)
}
