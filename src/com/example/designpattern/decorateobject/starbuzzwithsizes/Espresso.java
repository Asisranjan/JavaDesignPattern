package com.example.designpattern.decorateobject.starbuzzwithsizes;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	double cost() {
		return 1.99;
	}

}
