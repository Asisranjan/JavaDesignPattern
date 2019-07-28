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
		Quackable gooseDuck = gooseFactory.createGooseDuck();
//		quack(gooseDuck);
//		quack(mallardDuck);
//		quack(duckCall);
//		quack(redheadDuck);
//		quack(rubberDuck);
		
		Flock flock = new Flock();
		flock.add(mallardDuck);
		flock.add(duckCall);
		flock.add(redheadDuck);
		flock.add(rubberDuck);
		flock.add(gooseDuck);
		
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Flock mflock = new Flock();
		mflock.add(mallardOne);
		mflock.add(mallardTwo);
		mflock.add(mallardThree);
		flock.add(mflock);
		
		quack(flock);
		System.out.println("quack mallard family");
		quack(mflock);
		
		System.out.println("total quack: "+QuackCounter.getCount());
	}

	private void quack(Quackable quackable) {
		// TODO Auto-generated method stub
		quackable.quack();
	}

}
