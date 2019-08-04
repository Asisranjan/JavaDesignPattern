package com.example.designpattern.ch12;



public class MallardDuck implements Quackable {

	private Observable observable;
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("quack");
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
