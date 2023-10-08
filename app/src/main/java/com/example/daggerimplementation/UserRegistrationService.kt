package com.example.daggerimplementation

import javax.inject.Inject

@ActivityScope
class UserRegistrationService @Inject constructor(
    @FirestoreModifier private val userRepository: UserRepository,
    @EmailModifier private val notificationService: NotificationService) {
    fun registerUser(email:String, password : String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"no-reply@shubham.com","User Registered")
    }
}