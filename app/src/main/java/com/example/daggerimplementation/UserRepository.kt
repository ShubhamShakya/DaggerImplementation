package com.example.daggerimplementation

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email:String, password : String)
}

@ActivityScope
class SaveDb @Inject constructor(private val analyticsService: AnalyticsService): UserRepository {
     override fun saveUser(email: String, password: String) {
         Log.d("UserRepository","User saved in DB")
         analyticsService.sendEvent("Create User","CREATE")
    }

}

@ActivityScope
class SaveFirestore @Inject constructor(private val analyticsService: AnalyticsService): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("UserRepository","User saved in Firestore")
        analyticsService.sendEvent("Create User","CREATE")
    }

}
