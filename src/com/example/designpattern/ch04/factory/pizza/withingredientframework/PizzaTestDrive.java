package com.example.designpattern.ch04.factory.pizza.withingredientframework;

import com.example.designpattern.ch04.factory.pizza.withingredientframework.chicago.ChicagoPizzaStore;
import com.example.designpattern.ch04.factory.pizza.withingredientframework.ny.NYPizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a "+pizza.getName());
	}

}
