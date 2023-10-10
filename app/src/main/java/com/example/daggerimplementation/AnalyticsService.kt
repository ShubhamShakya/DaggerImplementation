package com.example.daggerimplementation

import android.util.Log
import javax.inject.Inject

interface AnalyticsService {
    fun sendEvent(eventName : String, eventType : String)
}

class MixPanel  @Inject constructor(): AnalyticsService{
    override fun sendEvent(eventName: String, eventType: String) {
      Log.d("AnalyticsService","Event send to Mixpanel : $eventName, $eventType")
    }

}

/*class FirebaseAnalytics() : AnalyticsService{
    override fun sendEvent(eventName: String, eventType: String) {
        Log.d("AnalyticsService","Event send to Firebase Analytics : $eventName, $eventType")
    }

}*/
