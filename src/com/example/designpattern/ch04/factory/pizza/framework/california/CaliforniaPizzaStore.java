package com.example.designpattern.ch04.factory.pizza.framework.california;

import com.example.designpattern.ch04.factory.pizza.framework.Pizza;
import com.example.designpattern.ch04.factory.pizza.framework.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new CaliforniaStyleCheesePizza();
		}
		else if (type.equals("peeperoni")) {
			pizza = new CaliforniaStylePeeperoniPizza();
		}
		else if (type.equals("clam")) {
			pizza = new CaliforniaStyleClamPizza();
		}
		else if (type.equals("veggie")) {
			pizza = new CaliforniaStyleVeggiePizza();
		}
		
		return pizza;
	}

}
