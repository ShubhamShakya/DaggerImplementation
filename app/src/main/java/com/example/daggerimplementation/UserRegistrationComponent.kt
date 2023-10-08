package com.example.daggerimplementation

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent( modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance retryCount : Int) : UserRegistrationComponent
    }
}
