package com.example.designpattern.ch12;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		AbstractGooseFactory gooseDuckFactory = new GooseDuckFactory();
		simulator.simulate(duckFactory, gooseDuckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {
		// TODO Auto-generated method stub
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		quack(mallardDuck);
		quack(duckCall);
		quack(redheadDuck);
		quack(rubberDuck);
		
		Quackable gooseDuck = gooseFactory.createGooseDuck();
		quack(gooseDuck);
		
		System.out.println("total quack: "+QuackCounter.getCount());
	}

	private void quack(Quackable quackable) {
		// TODO Auto-generated method stub
		quackable.quack();
	}

}
