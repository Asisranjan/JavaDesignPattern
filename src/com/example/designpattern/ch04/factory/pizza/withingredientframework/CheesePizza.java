package com.example.designpattern.ch04.factory.pizza.withingredientframework;

import com.example.designpattern.ch04.factory.pizza.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing "+name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createChesse();
	}

}
