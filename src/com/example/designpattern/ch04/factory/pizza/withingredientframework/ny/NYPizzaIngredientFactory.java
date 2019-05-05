package com.example.designpattern.ch04.factory.pizza.withingredientframework.ny;

import com.example.designpattern.ch04.factory.pizza.ingredient.Cheese;
import com.example.designpattern.ch04.factory.pizza.ingredient.Clams;
import com.example.designpattern.ch04.factory.pizza.ingredient.Dough;
import com.example.designpattern.ch04.factory.pizza.ingredient.Peeperoni;
import com.example.designpattern.ch04.factory.pizza.ingredient.PizzaIngredientFactory;
import com.example.designpattern.ch04.factory.pizza.ingredient.Sauce;
import com.example.designpattern.ch04.factory.pizza.ingredient.Veggies;
import com.example.designpattern.ch04.factory.pizza.withingredientframework.SlicedPeeperoni;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese createChesse() {
		// TODO Auto-generated method stub
		return new RegianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPeeper()};
		return veggies;
	}

	@Override
	public Peeperoni createPeeperoni() {
		// TODO Auto-generated method stub
		return new SlicedPeeperoni();
	}

	@Override
	public Clams createClams() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}

}
