package com.example.designpattern.ch08.barista;

public abstract class CaffineBeverage {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	protected abstract void addCondiments();

	protected abstract void brew();

	public void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("boil water");
	}
	
	public void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("pour in cup");
	}
}
