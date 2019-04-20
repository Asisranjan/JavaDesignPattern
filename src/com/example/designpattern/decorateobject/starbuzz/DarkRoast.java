package com.example.designpattern.decorateobject.starbuzz;

public class DarkRoast extends Beverage {

	public DarkRoast()
	{
		description = "Dark Roast";
	}
	
	@Override
	double cost() {
		return 0.99;
	}

}
