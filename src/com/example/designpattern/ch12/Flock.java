package com.example.designpattern.ch12;

import java.util.ArrayList;

public class Flock implements Quackable {
	ArrayList quackers = new ArrayList<>();
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		for (Object quacker : quackers) {
			((Quackable)quacker).quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		for (Object quacker : quackers) {
			((Quackable)quacker).registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
