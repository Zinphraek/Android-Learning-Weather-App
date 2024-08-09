package com.practice.weatherapplication.screens.main

import androidx.lifecycle.ViewModel
import com.practice.weatherapplication.data.DataOrExceptionError
import com.practice.weatherapplication.models.weather.Weather
import com.practice.weatherapplication.repositories.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: WeatherRepository) : ViewModel() {

  suspend fun getWeatherData(
	latitude: String, longitude: String, units: String
  ): DataOrExceptionError<Weather, Boolean, Exception> {
	return repository.getWeather(latitude, longitude, units)
  }
}