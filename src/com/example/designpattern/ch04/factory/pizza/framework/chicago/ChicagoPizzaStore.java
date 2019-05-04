package com.example.designpattern.ch04.factory.pizza.framework.chicago;

import com.example.designpattern.ch04.factory.pizza.framework.Pizza;
import com.example.designpattern.ch04.factory.pizza.framework.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		else if (type.equals("peeperoni")) {
			pizza = new ChicagoStylePeeperoniPizza();
		}
		else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		}
		else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		
		return pizza;
	}

}
