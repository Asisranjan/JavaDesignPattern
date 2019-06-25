package com.example.designpattern.ch08.barista;

public abstract class CaffineBeverageWithHook {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
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
