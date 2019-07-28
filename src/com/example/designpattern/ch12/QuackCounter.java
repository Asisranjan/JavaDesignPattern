package com.example.designpattern.ch12;

public class QuackCounter implements Quackable {
	static int totalCount;
	Quackable quackable;
	
	public QuackCounter(Quackable quackable) {
		this.quackable = quackable;
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		quackable.quack();
		++totalCount;
	}
	
	public static int getCount() {
		return totalCount;
	}

}
