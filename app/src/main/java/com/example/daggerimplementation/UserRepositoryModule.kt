package com.example.daggerimplementation

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class UserRepositoryModule {
    @Binds
    @ActivityScope
    abstract fun getRoomDb(sqlRepository: SaveDb) : UserRepository

    @Binds
    @FirestoreModifier
    @ActivityScope
     abstract fun getFirestoreRepo(firestore: SaveFirestore) : UserRepository
}
