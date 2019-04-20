package com.example.designpattern.decorateobject.starbuzz;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}

	abstract double cost();
}
