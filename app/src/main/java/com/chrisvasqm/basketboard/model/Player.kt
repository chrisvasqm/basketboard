package com.chrisvasqm.basketboard.model

class Player(var name: String) {
    private var _points = 0
    val points
        get() = _points

    private var _fouls = 0
    val fouls
        get() = _fouls

    private var _assists = 0
    val assists
        get() = _assists

    fun addPoints(points: Int) {
        if (points < 0)
            throw IllegalArgumentException("Negative values are not allowed. Use removePoint() instead")

        _points += points
    }

    fun removePoints(points: Int) {
        if (_points < points)
            throw IllegalArgumentException("Points to be removed can't be higher than the total")

        _points -= points
    }

    fun addAssist() {
        _assists++
    }

}
