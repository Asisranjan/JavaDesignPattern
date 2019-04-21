package com.example.designpattern.ch01.simuduck;

public class MallarDuck extends Duck{
	public MallarDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a real Mallar Duck");
	}
}
