package com.practice.weatherapplication.data

class DataOrExceptionError<T, Boolean, E : Exception>(
  var data: T? = null,
  var loading: Boolean? = null,
  var e: E? = null
)