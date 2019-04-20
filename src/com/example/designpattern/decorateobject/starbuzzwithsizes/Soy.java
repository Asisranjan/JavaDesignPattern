package com.example.designpattern.decorateobject.starbuzzwithsizes;

public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	double cost() {
		double beverageCost = beverage.cost();
		Size size = this.getSize();
		System.out.println(size);
		if (size == Size.SMALL) {
			return 10 + beverageCost;
		}
		if (size == Size.MIDIUM) {
			return 15 + beverageCost;
		}
		if (size == Size.LARGE) {
			return 20 + beverageCost;
		}
		return beverageCost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy.";
	}
}
