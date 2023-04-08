package com.lyvetech.cloudy.di

import com.lyvetech.cloudy.domain.repository.HomeRepository
import com.lyvetech.cloudy.data.repository.HomeRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class WeatherRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(repository: HomeRepositoryImpl): HomeRepository
}