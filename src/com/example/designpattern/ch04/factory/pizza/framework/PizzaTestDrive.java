package com.example.designpattern.ch04.factory.pizza.framework;

import com.example.designpattern.ch04.factory.pizza.framework.chicago.ChicagoPizzaStore;
import com.example.designpattern.ch04.factory.pizza.framework.ny.NYPizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.name() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a "+pizza.name());
	}

}
