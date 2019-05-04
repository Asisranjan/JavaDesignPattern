package com.example.designpattern.ch04.factory.pizza.framework.ny;

import com.example.designpattern.ch04.factory.pizza.framework.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza()
	{
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Chesse");
	}
}
