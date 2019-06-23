package com.example.designpattern.ch07.leastknowledgeprinciple;

public class Car {
	Engine engine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public void start(Key key) {
		Doors doors = new Doors();
		boolean authorized = key.turns();
		if (authorized) {
			engine.start();
			updateDashboardDisplay();
			doors.lock();
		}
	}

	private void updateDashboardDisplay() {
		// TODO Auto-generated method stub
		
	}
}
//least knowledge principle = law of demeter
