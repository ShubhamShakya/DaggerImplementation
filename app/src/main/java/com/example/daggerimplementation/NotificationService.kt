package com.example.daggerimplementation

import android.util.Log
import javax.inject.Inject

interface NotificationService {
fun send(to : String, from : String , body : String)
}

@ActivityScope
class EmailService  constructor(val retryCount : Int) : NotificationService{
     override fun send(to: String, from: String, body: String) {
        Log.d("NotificationService","email sent : $retryCount")
    }

}

@ActivityScope
class MessageService constructor():NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("NotificationService","message sent")
    }

}
