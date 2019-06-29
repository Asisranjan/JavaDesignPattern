package com.example.designpattern.ch09.iteratorandcomposite.menuitem;

public class MenuItem {
	private String name;
	private String description;
	private double price;
	private boolean vegeterian;
	
	public MenuItem(String name, String description, double price, boolean vegeterian) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegeterian = vegeterian;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}
	
}
