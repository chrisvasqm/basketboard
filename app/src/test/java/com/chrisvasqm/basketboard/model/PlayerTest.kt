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
    fun `Player's name can be changed later`() {
        player.name = "Test2"

        assertThat(player.name).isEqualTo("Test2")
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

    @Test
    fun `Player's points can be decreased`() {
        player.addPoints(1)

        player.removePoints(1)

        assertThat(player.points).isEqualTo(0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `If a player has 0 points and we remove any point, an IllegalArgumentException will be thrown`() {
        player.removePoints(1)
    }

    @Test
    fun `Can a player assist`() {
        player.addAssist()

        assertThat(player.assists).isEqualTo(1)
    }

    @Test
    fun `Can the user remove a player's assist`() {
        player.addAssist()
        player.removeAssist()

        assertThat(player.assists).isEqualTo(0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `If a player has 0 assists and we remove one more, an IllegalArgumentException will be thrown`() {
        player.removeAssist()
    }

    @Test
    fun `If a player makes a foul, his foul count will increase`() {
        player.addFoul()

        assertThat(player.fouls).isEqualTo(1)
    }
}
