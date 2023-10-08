package com.example.daggerimplementation

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsServiceModule::class])
interface AppComponent {
    fun getUserRegistrationComponentBuilder() : UserRegistrationComponent.Builder
}