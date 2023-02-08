package com.vasyancoder.composition.domain.repository

import com.vasyancoder.composition.domain.entity.GameSettings
import com.vasyancoder.composition.domain.entity.Level
import com.vasyancoder.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}