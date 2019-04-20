package com.example.designpattern.decorateobject.starbuzzwithsizes;

public abstract class Beverage {
	enum Size{
		SMALL, MIDIUM, LARGE;
	}
	protected String description = "Unknown Beverage";
	private Size size = Size.SMALL;
	
	public String getDescription() {
		return description;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	abstract double cost();
}
