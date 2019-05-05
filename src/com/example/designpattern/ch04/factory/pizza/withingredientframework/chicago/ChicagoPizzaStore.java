package com.example.designpattern.ch04.factory.pizza.withingredientframework.chicago;

import com.example.designpattern.ch04.factory.pizza.ingredient.PizzaIngredientFactory;
import com.example.designpattern.ch04.factory.pizza.withingredientframework.CalmPizza;
import com.example.designpattern.ch04.factory.pizza.withingredientframework.CheesePizza;
import com.example.designpattern.ch04.factory.pizza.withingredientframework.PepperoniPizza;
import com.example.designpattern.ch04.factory.pizza.withingredientframework.Pizza;
import com.example.designpattern.ch04.factory.pizza.withingredientframework.PizzaStore;
import com.example.designpattern.ch04.factory.pizza.withingredientframework.VegiePizza;
import com.example.designpattern.ch04.factory.pizza.withingredientframework.ny.NYPizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("NY Style cheese pizza");
		}
		else if (type.equals("peeperoni")) {
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("NY Style Peeperoni Pizza");
		}
		else if (type.equals("clam")) {
			pizza = new CalmPizza(pizzaIngredientFactory);
			pizza.setName("NY Style Calm Pizza");
		}
		else if (type.equals("veggie")) {
			pizza = new VegiePizza(pizzaIngredientFactory);
			pizza.setName("NY Style Veggie Pizza");
		}
		
		return pizza;
	}

}
