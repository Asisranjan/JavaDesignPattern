package com.example.designpattern.ch02.javalikeobserver.weatherdata;

import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement{
	private float heatIndex = 0.0f;
	private Observable weatherData;
	
	public HeatIndexDisplay(Observable weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Heat index is " + heatIndex);
	}

	private float computeHeatIndex(float temp, float humidity) {
		// TODO Auto-generated method stub
		return (float)((16.923 + (0.185212 * temp) + (5.37941 * humidity) - (0.100254 * temp * humidity) 
				+ (0.00941695 * (temp * temp)) + (0.00728898 * (humidity * humidity)) 
				+ (0.000345372 * (temp * temp * humidity)) - (0.000814971 * (temp * humidity * humidity)) +
				(0.0000102102 * (temp * temp * humidity * humidity)) - (0.000038646 * (temp * temp * temp)) + (0.0000291583 * 
				(humidity * humidity * humidity)) + (0.00000142721 * (temp * temp * temp * humidity)) + 
				(0.000000197483 * (temp * humidity * humidity * humidity)) - (0.0000000218429 * (temp * temp * temp * humidity * humidity)) +
				0.000000000843296 * (temp * temp * humidity * humidity * humidity)) -
				(0.0000000000481975 * (temp * temp * temp * humidity * humidity * humidity)));
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		WeatherData weatherData = (WeatherData) o;
		heatIndex = computeHeatIndex(weatherData.getTemp(), weatherData.getHumidity());
		display();
	}

}
