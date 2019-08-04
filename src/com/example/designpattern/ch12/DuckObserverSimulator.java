package com.example.designpattern.ch12;

public class DuckObserverSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckObserverSimulator sim = new DuckObserverSimulator();
		AbstractDuckFactory df = new CountingDuckFactory();
		sim.simulate(df);
	}

	private void simulate(AbstractDuckFactory df) {
		// TODO Auto-generated method stub
		Quackable mallardDuck = df.createMallardDuck();
		Quackable duckCall = df.createDuckCall();
		Quackable redheadDuck = df.createRedheadDuck();
		Quackable rubberDuck = df.createRubberDuck();
		
		Flock flock = new Flock();
		flock.add(mallardDuck);
		flock.add(duckCall);
		flock.add(redheadDuck);
		flock.add(rubberDuck);
		
		System.out.println("Duck simulator with observer");
		
		Quackologist quackologist = new Quackologist();
		flock.registerObserver(quackologist);
		
		simulate(flock);
		
		System.out.println("The duck quacked "+QuackCounter.getCount()+" times");
	}

	private void simulate(Quackable quackable) {
		// TODO Auto-generated method stub
		quackable.quack();
	}

}
