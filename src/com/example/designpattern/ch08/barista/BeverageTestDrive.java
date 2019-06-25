package com.example.designpattern.ch08.barista;

public class BeverageTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Making tea..");
		TeaWithHook teaWithHook = new TeaWithHook();
		teaWithHook.prepareRecipe();
		
		System.out.println("Making coffe..");
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		coffeeWithHook.prepareRecipe();
	}

}
