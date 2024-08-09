package com.practice.weatherapplication.screens.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun WeatherMainScreen(
  navController: NavController,
  mainViewModel: MainViewModel = hiltViewModel()
) {
  Text(text = "Main Screen!")
}