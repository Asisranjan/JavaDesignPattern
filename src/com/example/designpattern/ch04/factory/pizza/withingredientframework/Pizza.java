package com.example.designpattern.ch04.factory.pizza.withingredientframework;

import java.util.ArrayList;

import com.example.designpattern.ch04.factory.pizza.ingredient.Cheese;
import com.example.designpattern.ch04.factory.pizza.ingredient.Clams;
import com.example.designpattern.ch04.factory.pizza.ingredient.Dough;
import com.example.designpattern.ch04.factory.pizza.ingredient.Peeperoni;
import com.example.designpattern.ch04.factory.pizza.ingredient.Sauce;
import com.example.designpattern.ch04.factory.pizza.ingredient.Veggies;

public abstract class Pizza {

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies[] veggies;
	protected Cheese cheese;
	protected Peeperoni peeperoni;
	protected Clams clams;
	
	protected abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place Pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return null;
	}
}
