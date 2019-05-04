package com.example.designpattern.ch04.factory.pizza.simplesolution;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		}
		else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		else if (type.equals("calm")) {
			pizza = new CalmPizza();
		}
		else if(type.equals("veggie")) {
			pizza = new VegiePizza();
		}
		return pizza;
	}
	
}
