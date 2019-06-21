package com.example.designpattern.ch07.adaptive;

public class DuckTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		
		System.out.println("The turkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		
		System.out.println("The Duck says..");
		testDuck(mallardDuck);
		
		System.out.println("The turkey adapter says...");
		testDuck(turkeyAdapter);
	}

	private static void testDuck(Duck duck) {
		// TODO Auto-generated method stub
		duck.quack();
		duck.fly();
	}

}
