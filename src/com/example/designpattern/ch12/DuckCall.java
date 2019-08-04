package com.example.designpattern.ch12;

public class DuckCall implements Quackable {
	Observable observable;
	
	public DuckCall() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("kwak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
}
