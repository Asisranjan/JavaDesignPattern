package com.example.designpattern.ch12;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		// TODO Auto-generated method stub
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new RedheadDuck();
	}

	@Override
	public Quackable createRubberDuck() {
		// TODO Auto-generated method stub
		return new RubberDuck();
	}

	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new DuckCall();
	}

}
