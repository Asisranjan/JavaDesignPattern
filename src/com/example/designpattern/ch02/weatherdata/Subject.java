package com.example.designpattern.ch02.weatherdata;

public interface Subject {
	void registerObserver(Observer observer);
	void deregisterObserver(Observer observer);
	void notifyObservers();
}
