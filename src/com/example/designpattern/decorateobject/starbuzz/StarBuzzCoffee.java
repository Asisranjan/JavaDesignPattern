package com.example.designpattern.decorateobject.starbuzz;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		System.out.println("cost of "+beverage.getDescription()+" is $"+beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		beverage2 = new Soy(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println("cost of "+beverage2.getDescription()+" is $"+beverage2.cost());
	}

}
