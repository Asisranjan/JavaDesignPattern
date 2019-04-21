package com.example.designpattern.ch01.simuduck;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	
	protected QuackBehavior quackBehavior;
	
	abstract void display();
	
	void swim() {
		System.out.println("All ducks swim. even decoys!");
	}
	
	void performFly() {
		flyBehavior.fly();
	}
	
	void performQuack() {
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
