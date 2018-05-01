package com.chrisvasqm.basketboard.model

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class PlayerTest {
    private lateinit var player: Player

    @Before
    fun setUp() {
        player = Player("Test")
    }

    @Test
    fun `When a player scores a point, his total score increases`() {
        player.addPoints(1)

        assertThat(player.points).isEqualTo(1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `If the user tries to add a negative number, an IllegalArgumentException will be thrown`() {
        player.addPoints(-1)
    }

}