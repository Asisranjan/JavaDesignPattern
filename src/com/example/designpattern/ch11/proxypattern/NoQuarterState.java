package com.example.designpattern.ch11.proxypattern;

public class NoQuarterState implements State {
	private transient GumballMachine gm;
	
	public NoQuarterState(GumballMachine gm) {
		// TODO Auto-generated constructor stub
		this.gm = gm;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you have inserted quarter");
		gm.setState(gm.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't eject quarter as no quarter yet");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you can not turn crank");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("you cannot dispense");
	}

	public String toString() {
		return "no quarter";
	}
}
