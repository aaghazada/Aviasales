package com.example.aviasales.di

import com.example.aviasales.repository.OffersRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun providesOffersRepository(): OffersRepository {
        return OffersRepository()
    }
}