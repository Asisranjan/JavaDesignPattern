package com.example.designpattern.ch09.iteratorandcomposite.menuitem.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegeterian;
	double price;
	
	public MenuItem(String name, String description, boolean vegeterian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegeterian = vegeterian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(boolean vegeterian) {
		this.vegeterian = vegeterian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(" " + name);
		if (vegeterian) {
			System.out.print("(v)");
		}
		System.out.println(", " + price);
		System.out.println("	-- " + description);
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
}
