package com.practice.weatherapplication.network

import com.practice.weatherapplication.models.weather.WeatherObject
import com.practice.weatherapplication.utils.Constants
import jakarta.inject.Singleton
import retrofit2.http.GET
import retrofit2.http.Query

@Singleton
interface WeatherApi {
  @GET(value = Constants.WEATHER_DATA_PATH)
  suspend fun getWeather(
	@Query("q") query: String,
	@Query("units") units: String = "imperial",
	@Query("appid") appid: String = Constants.API_KEY
  ): WeatherObject
}