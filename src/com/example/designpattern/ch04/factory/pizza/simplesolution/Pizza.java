package com.example.designpattern.ch04.factory.pizza.simplesolution;

public interface Pizza {

	abstract void prepare();

	void bake();

	void cut();

	void box();

}
