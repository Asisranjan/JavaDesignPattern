package com.example.designpattern.ch11.proxypattern;

import java.util.Random;

public class HasQuarterState implements State {
	transient GumballMachine gm;
	transient Random randomWinner = new Random(System.currentTimeMillis());
	public HasQuarterState(GumballMachine gumballMachineRevised) {
		// TODO Auto-generated constructor stub
		this.gm = gumballMachineRevised;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Insert quarter is not allowed");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Ejecting quarter");
		gm.setState(gm.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		int winner = randomWinner.nextInt(10);
		System.out.println("turn crank winner = "+winner);
		if (winner == 0 && gm.getCount() > 1) {
			gm.setState(gm.getWinnerState());
		}
		else {
			gm.setState(gm.getSoldState());
		}
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "has quarter";
	}
}
