package com.example.weatherapp

data class weatherappX(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<WeatherX>,
    val message: Double,
    val temp:Temp,
    val clouds: Int,
    val deg: Int,
    val dt: Int,
    val feels_like: FeelsLike,
    val gust: Double,
    val humidity: Int,
    val pop: Int,
    val pressure: Int,
    val speed: Double,
    val sunrise: Int,
    val sunset: Int,
    val weather: List<WeatherX>
)