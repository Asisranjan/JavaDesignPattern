package com.example.designpattern.ch12;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable quack) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist: "+quack+" just quacked");
	}

}
