package com.lyvetech.cloudy.di

import com.lyvetech.cloudy.data.repository.WeatherRepositoryImpl
import com.lyvetech.cloudy.domain.repository.WeatherRepository
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
    abstract fun bindRepository(repository: WeatherRepositoryImpl): WeatherRepository
}