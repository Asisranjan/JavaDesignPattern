package com.example.designpattern.ch02.javalikeobserver.weatherdata;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temp;
	private float humidity;
	private float pressure;
	private Observable weatherData;
	
	public CurrentConditionsDisplay(Observable weatherData)
	{
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current condtions: \ntemp:"+temp+"\nhumidty:"+humidity+"\npressure:"+pressure);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		WeatherData weatherData = (WeatherData) o;
		temp = weatherData.getTemp();
		humidity = weatherData.getHumidity();
		pressure = weatherData.getPressure();
		display();
	}

}
