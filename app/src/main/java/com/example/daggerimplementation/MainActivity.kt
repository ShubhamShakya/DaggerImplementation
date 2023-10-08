package com.example.daggerimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
     lateinit var userRegistrationService: UserRegistrationService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val userRepo = UserRepository();
        val notificationService = NotificationService()
        val userRegistrationService = UserRegistrationService(userRepo,notificationService)*/

       /*
        * After create factory in UserRegistrationComponent we can't create component object like this now we have to
        * use create method to do this.
        *
        val component = DaggerUserRegistrationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()*/
        //Using create method to create object
        val appComponent = (application as UserApplication).appComponent
        //val userRegistrationService = component.getUserRegistrationService()
        val component = appComponent.getUserRegistrationComponentFactory().create(3)
        component.inject(this)
        println("ssssss $userRegistrationService")
        println("sssssst $appComponent")

        userRegistrationService.registerUser("shubham@gmail.com","888888")
        //val component = DaggerUserRegistrationComponent.builder().build();

    }
}