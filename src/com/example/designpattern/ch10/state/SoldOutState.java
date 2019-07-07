package com.example.designpattern.ch10.state;

public class SoldOutState implements State{
	GumballMachineRevised gm;
	public SoldOutState(GumballMachineRevised gumballMachineRevised) {
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
		System.out.println("eject quarter is not allowe");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("turn crank is not allowed");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("dispense is not allowed");
	}

	public String toString() {
		return "sold out";
	}
}
