package com.example.daggerimplementation

import java.lang.annotation.Documented
import javax.inject.Qualifier

@Qualifier
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class EmailModifier()

@Qualifier
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class FirestoreModifier()
