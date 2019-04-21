package com.example.designpattern.ch01.simuduck;

public class ModelDuck extends Duck {

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a model duck");
	}

}
