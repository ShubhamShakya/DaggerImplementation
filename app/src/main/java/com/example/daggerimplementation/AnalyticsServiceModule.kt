package com.example.daggerimplementation

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AnalyticsServiceModule {
    @Singleton
    @Provides
    fun getMixPanel() : AnalyticsService{
        return MixPanel()
    }
}