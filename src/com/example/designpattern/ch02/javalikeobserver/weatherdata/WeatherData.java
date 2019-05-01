package com.example.designpattern.ch02.javalikeobserver.weatherdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
	}
	
	public void setMeasurement (float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}

	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
