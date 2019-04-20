package com.example.designpattern.decorateobject.starbuzzwithsizes;

import com.example.designpattern.decorateobject.starbuzzwithsizes.Beverage.Size;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Soy(beverage2);
		beverage2.setSize(Size.MIDIUM);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println("cost of "+beverage2.getDescription()+" is $"+beverage2.cost());
	}

}
