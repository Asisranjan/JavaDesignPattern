package com.example.designpattern.ch12;

public class GooseAdapter implements Quackable{
	public Goose goose;
	
	public GooseAdapter(Goose goose) {
		// TODO Auto-generated constructor stub
		this.goose = goose;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
	}
	
}
