package com.example.designpattern.ch04.factory.pizza.dependencyinversionprinciple;

import com.example.designpattern.ch04.factory.pizza.framework.Pizza;
import com.example.designpattern.ch04.factory.pizza.framework.chicago.ChicagoStyleCheesePizza;
import com.example.designpattern.ch04.factory.pizza.framework.chicago.ChicagoStyleClamPizza;
import com.example.designpattern.ch04.factory.pizza.framework.chicago.ChicagoStylePeeperoniPizza;
import com.example.designpattern.ch04.factory.pizza.framework.chicago.ChicagoStyleVeggiePizza;
import com.example.designpattern.ch04.factory.pizza.framework.ny.NYStyleCheesePizza;
import com.example.designpattern.ch04.factory.pizza.framework.ny.NYStyleClamPizza;
import com.example.designpattern.ch04.factory.pizza.framework.ny.NYStylePeeperoniPizza;
import com.example.designpattern.ch04.factory.pizza.framework.ny.NYStyleVeggiePizza;

public class DependentPizzaStore {
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		
		if (style.equals("ny")) {
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
		}
		else if (style.equals("chicago")) {
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
		}
		if (pizza != null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
		
		return pizza;
	}
}
