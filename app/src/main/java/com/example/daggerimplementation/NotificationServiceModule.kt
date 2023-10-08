package com.example.daggerimplementation

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule ()  {

    @ActivityScope
    @EmailModifier
    @Provides
    fun getEmailService(retryCount : Int) : NotificationService{
        return EmailService(retryCount)
    }

    @ActivityScope
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService()
    }
}
