package com.example.designpattern.ch12;

import java.util.ArrayList;

public class Observable implements QuackObservable {
	ArrayList observers = new ArrayList<>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		// TODO Auto-generated constructor stub
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Object o : observers) {
			((Observer) o ).update(duck); 
		}
	}

}
