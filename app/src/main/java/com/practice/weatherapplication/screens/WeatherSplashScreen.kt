package com.practice.weatherapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.practice.weatherapplication.R

@Composable
fun WeatherSplashScreen(navController: NavController) {
  Surface(
	modifier = Modifier
	  .padding(15.dp)
	  .size(330.dp),
	shape = CircleShape,
	color = Color.White,
	border = BorderStroke(width = 2.dp, color = Color.LightGray)
  ) {
	Column(
	  modifier = Modifier.padding(1.dp),
	  horizontalAlignment = Alignment.CenterHorizontally,
	  verticalArrangement = Arrangement.Center
	) {
	  Image(
		painter = painterResource(id = R.drawable.sun),
		contentDescription = stringResource(id = R.string.sun),
		contentScale = ContentScale.Fit,
		modifier = Modifier.size(95.dp)
	  )
	  Text(
		text = "Find the Sun",
		style = MaterialTheme.typography.headlineSmall,
		color = Color.LightGray

	  )
	}
  }
}