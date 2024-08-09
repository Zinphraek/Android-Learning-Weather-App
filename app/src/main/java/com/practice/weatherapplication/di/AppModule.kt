package com.practice.weatherapplication.di

import com.practice.weatherapplication.network.WeatherApi
import com.practice.weatherapplication.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
  @Provides
  @Singleton
  fun provideOpenWeatherApi(): WeatherApi {
	return Retrofit.Builder()
	  .baseUrl(Constants.BASE_URL)
	  .addConverterFactory(GsonConverterFactory.create())
	  .build()
	  .create(WeatherApi::class.java)
  }
}