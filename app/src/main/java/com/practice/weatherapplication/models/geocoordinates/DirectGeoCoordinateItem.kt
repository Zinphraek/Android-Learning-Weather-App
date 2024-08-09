package com.practice.weatherapplication.models.geocoordinates

data class DirectGeoCoordinateItem(
  val country: String,
  val lat: Double,
  val local_names: LocalNames,
  val lon: Double,
  val name: String,
  val state: String
)