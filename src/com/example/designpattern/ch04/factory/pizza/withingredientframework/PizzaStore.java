package com.example.designpattern.ch04.factory.pizza.withingredientframework;

public abstract class PizzaStore {
	
	Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	protected abstract Pizza createPizza(String type);
}
