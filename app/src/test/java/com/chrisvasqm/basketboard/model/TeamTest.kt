package com.chrisvasqm.basketboard.model

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class TeamTest {
    private lateinit var team: Team

    @Before
    fun setUp() {
        team = Team("Team A", mutableListOf())
    }

    @Test
    fun `Can change Team's name`() {
        team.name = "Team B"

        assertThat(team.name).isEqualTo("Team B")
    }
}