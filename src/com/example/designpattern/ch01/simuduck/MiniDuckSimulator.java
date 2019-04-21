package com.example.designpattern.ch01.simuduck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallarDuck = new MallarDuck();
		mallarDuck.performFly();
		mallarDuck.performQuack();
		
		System.out.println("=============================");
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		// add behavior at runtime
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		modelDuck.performQuack();
	}

}
