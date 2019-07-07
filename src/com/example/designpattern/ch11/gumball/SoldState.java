package com.example.designpattern.ch11.gumball;

public class SoldState implements State {
	GumballMachine gm;
	public SoldState(GumballMachine gumballMachineRevised) {
		// TODO Auto-generated constructor stub
		this.gm = gumballMachineRevised;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("insert quarter is not allowed");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("eject quarter is not allowed");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("turn crank is not allowed");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gm.releaseBall();
		if (gm.getCount() > 0){
			gm.setState(gm.getNoQuarterState());
		}
		else {
			System.out.println("Oops out of gumball");
			gm.setState(gm.getSoldOutState());
		}
	}

	public String toString() {
		return "sold";
	}
}
