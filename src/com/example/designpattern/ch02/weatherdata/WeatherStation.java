package com.example.designpattern.ch02.weatherdata;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		Observer currentDisplay = new CurrentConditionsDisplay(weatherData);
		Observer statsDisplay = new StatisticsDisplay(weatherData);
		Observer forecastDisplay = new ForecastDisplay(weatherData);
		Observer heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurement(80, 65, 30.4f);
		System.out.println("===========================");
		weatherData.setMeasurement(82, 70, 29.2f);
	}
}
