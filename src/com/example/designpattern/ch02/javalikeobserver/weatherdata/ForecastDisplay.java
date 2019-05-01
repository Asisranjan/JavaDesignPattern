package com.example.designpattern.ch02.javalikeobserver.weatherdata;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Observable weatherData;

	public ForecastDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	public void display() {
		System.out.print("Forecast Pressure: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		WeatherData weatherData = (WeatherData) o;
		lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();
		display();
	}
}