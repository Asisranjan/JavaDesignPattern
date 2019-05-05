package com.example.designpattern.ch04.factory.pizza.withingredientframework.chicago;

import com.example.designpattern.ch04.factory.pizza.withingredientframework.SlicedPeeperoni;
import com.example.designpattern.ch04.factory.pizza.ingredient.Cheese;
import com.example.designpattern.ch04.factory.pizza.ingredient.Clams;
import com.example.designpattern.ch04.factory.pizza.ingredient.Dough;
import com.example.designpattern.ch04.factory.pizza.ingredient.Peeperoni;
import com.example.designpattern.ch04.factory.pizza.ingredient.PizzaIngredientFactory;
import com.example.designpattern.ch04.factory.pizza.ingredient.Sauce;
import com.example.designpattern.ch04.factory.pizza.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createChesse() {
		// TODO Auto-generated method stub
		return new Mozzarella();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies[] = {new BlackOlives(), new Spinach(), new EggPlant()};
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
		return new FrozenClams();
	}

}
