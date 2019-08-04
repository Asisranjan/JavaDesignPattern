package com.example.designpattern.ch12;

public class GooseAdapter implements Quackable{
	public Goose goose;
	public Observable observable;
	
	public GooseAdapter() {
		observable = new Observable(this);
	}
	
	public GooseAdapter(Goose goose) {
		// TODO Auto-generated constructor stub
		this.goose = goose;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
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
	
}
