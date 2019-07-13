package com.example.designpattern.ch11.proxypattern;

public class WinnerState implements State {
	GumballMachine gm;
	public WinnerState(GumballMachine gumballMachineRevised) {
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
		System.out.println("You are winner. You got two gumball for your quarter");
		gm.releaseBall();
		if (gm.getCount() == 0) {
			gm.setState(gm.getSoldOutState());
		}
		else {
			gm.releaseBall();
			if (gm.getCount() > 0) {
				gm.setState(gm.getNoQuarterState());
			}
			else {
				System.out.println("oops, out of gumball");
				gm.setState(gm.getSoldOutState());
			}
		}
	}

}
