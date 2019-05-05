package com.example.designpattern.ch05.singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler instance;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if (instance == null) {
			instance = new ChocolateBoiler();
		}
		return instance;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			
			//fill the boiler with milk and chocolate mixture
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			//drain the boiled milk and chocolate
			empty = true;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()){
			//bring the contents to a boil
			boiled = true;
		}
	}

	private boolean isBoiled() {
		// TODO Auto-generated method stub
		return boiled;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return empty;
	}
}
