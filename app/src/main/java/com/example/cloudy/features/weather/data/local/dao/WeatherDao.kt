package com.example.cloudy.features.weather.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cloudy.features.weather.data.local.entity.WeatherEntity

@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeather(weatherData: WeatherEntity)

    @Query("DELETE FROM weather_table")
    suspend fun deleteAllWeather()

    @Query("SELECT * FROM weather_table")
    suspend fun getWeatherInfo(): WeatherEntity
}