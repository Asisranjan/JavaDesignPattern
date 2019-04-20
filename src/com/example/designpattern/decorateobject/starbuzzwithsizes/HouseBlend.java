package com.example.designpattern.decorateobject.starbuzzwithsizes;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend";
	}
	
	@Override
	double cost() {
		return 0.89;
	}
}
