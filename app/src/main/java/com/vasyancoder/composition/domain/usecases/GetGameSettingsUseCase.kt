package com.vasyancoder.composition.domain.usecases

import com.vasyancoder.composition.domain.entity.GameSettings
import com.vasyancoder.composition.domain.entity.Level
import com.vasyancoder.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}