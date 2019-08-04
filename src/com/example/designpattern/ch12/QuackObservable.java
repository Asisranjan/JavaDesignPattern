package com.example.designpattern.ch12;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
