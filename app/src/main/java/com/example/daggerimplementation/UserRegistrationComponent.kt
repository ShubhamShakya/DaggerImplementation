package com.example.daggerimplementation

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        fun build() : UserRegistrationComponent

        fun retryCount(@BindsInstance retryCount: Int) : Builder

        fun createAppComponent(appComponent: AppComponent) : Builder
        //fun create(@BindsInstance retryCount : Int,appComponent: AppComponent) : UserRegistrationComponent
        //fun addRetryCount(@BindsInstance retryCount: Int) : Builder

    }
}
