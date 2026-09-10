package com.example.choose2teams

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class LeaguePickerTest {
    @Test
    fun `returns exactly two unique teams for a selected league`() {
        val teams = randomTeamsForLeague("NBA")

        assertEquals(2, teams.size)
        assertEquals(teams.toSet().size, teams.size)
        assertTrue(teams.all { it in LEAGUES["NBA"]!! })
    }
}
