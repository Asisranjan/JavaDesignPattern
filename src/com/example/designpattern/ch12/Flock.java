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

}
