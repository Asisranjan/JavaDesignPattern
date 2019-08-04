package com.example.designpattern.ch12;

public class QuackCounter implements Quackable {
	static int totalCount;
	Quackable quackable;
	Observable observable;
	
	public QuackCounter(Quackable quackable) {
		this.quackable = quackable;
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		quackable.quack();
		notifyObservers();
		++totalCount;
	}
	
	public static int getCount() {
		return totalCount;
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
		return quackable.toString();
	}
}
