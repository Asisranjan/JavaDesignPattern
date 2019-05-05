package com.example.designpattern.ch04.factory.pizza.ingredient;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createChesse();
	public Veggies[] createVeggies();
	public Peeperoni createPeeperoni();
	public Clams createClams();
}
