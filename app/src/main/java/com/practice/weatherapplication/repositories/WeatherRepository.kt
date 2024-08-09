package com.practice.weatherapplication.repositories

import android.util.Log
import com.practice.weatherapplication.data.DataOrExceptionError
import com.practice.weatherapplication.models.geocoordinates.DirectGeoCoordinate
import com.practice.weatherapplication.models.weather.Weather
import com.practice.weatherapplication.network.WeatherApi
import jakarta.inject.Inject

class WeatherRepository @Inject constructor(private val api: WeatherApi) {

  suspend fun getWeather(latitude: String, longitude: String, units: String)
	  : DataOrExceptionError<Weather, Boolean, Exception> {
	val response = try {
	  val geoCoordinates = "$latitude&$longitude&$"
	  api.getWeather(query = geoCoordinates, units = units)
	} catch (e: Exception) {
	  Log.d("INSIDE", "getWeather : $e")
	  return DataOrExceptionError(e = e)
	}
	Log.d("INSIDE", "getWeather: $response")
	return DataOrExceptionError(data = response)

  }

  suspend fun getCityGeoCoordinates(city: String)
	  : DataOrExceptionError<DirectGeoCoordinate, Boolean, Exception> {
	val response = try {
	  api.getCityGeoCoordinates(query = city)
	} catch (e: Exception) {
	  Log.d("INSIDE", "getCityGeoCoordinates : $e")
	  return DataOrExceptionError(e = e)
	}
	Log.d("INSIDE", "getCityGeoCoordinates: $response")
	return DataOrExceptionError(data = response)
  }
}