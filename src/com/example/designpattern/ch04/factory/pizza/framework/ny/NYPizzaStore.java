package com.example.designpattern.ch04.factory.pizza.framework.ny;

import com.example.designpattern.ch04.factory.pizza.framework.Pizza;
import com.example.designpattern.ch04.factory.pizza.framework.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		}
		else if (type.equals("peeperoni")) {
			pizza = new NYStylePeeperoniPizza();
		}
		else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		}
		else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		
		return pizza;
	}

}
