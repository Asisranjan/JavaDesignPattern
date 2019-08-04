package com.example.designpattern.ch12;

public class RubberDuck implements Quackable {
	public Observable observable;
	
	public RubberDuck() {
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Squeak");
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
