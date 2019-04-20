package com.example.designpattern.decorateobject.starbuzzwithsizes;

public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	double cost() {
		return 0.1 + beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip.";
	}
}
