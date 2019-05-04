package com.example.designpattern.ch04.factory.pizza.framework.chicago;

import com.example.designpattern.ch04.factory.pizza.framework.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Chesse");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting the pizza in to square slices");
	}

}
