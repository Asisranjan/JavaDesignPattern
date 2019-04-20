package com.example.designpattern.decorateobject.starbuzzwithsizes;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	double cost() {
		return 0.2 + beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha.";
	}
}
