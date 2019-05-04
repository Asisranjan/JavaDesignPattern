package com.example.designpattern.ch04.factory.pizza.simplesolution;

public class PizzaStore {
	SimplePizzaFactory simplePizzaFactory;
	
	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}
	
	Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = simplePizzaFactory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
