package com.practice.weatherapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.practice.weatherapplication.navigation.WeatherNavigation
import com.practice.weatherapplication.ui.theme.WeatherApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
	super.onCreate(savedInstanceState)
	enableEdgeToEdge()
	setContent {
	  WeatherApp()
	}
  }
}

@Composable
fun WeatherApp() {
  WeatherApplicationTheme {
	Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxSize()) {
	  Column(
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	  ) {
		WeatherNavigation()
	  }
	}
  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  WeatherApplicationTheme {
  }
}