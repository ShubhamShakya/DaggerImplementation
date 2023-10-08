package com.example.daggerimplementation

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent( modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun build() : UserRegistrationComponent
        fun addRetryCount(@BindsInstance retryCount: Int) : Builder

    }
}
