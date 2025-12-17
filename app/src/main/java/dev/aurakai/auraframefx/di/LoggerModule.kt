package dev.aurakai.auraframefx.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.aurakai.auraframefx.utils.AuraFxLogger
import dev.aurakai.auraframefx.utils.LogLevel
import timber.log.Timber
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LoggerModule {

    @Provides
    @Singleton
    fun provideAuraFxLogger(): AuraFxLogger {
        return AuraFxLogger.Companion
    }
}
