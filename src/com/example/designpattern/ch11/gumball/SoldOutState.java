package com.example.designpattern.ch11.gumball;

public class SoldOutState implements State{
	GumballMachine gm;
	public SoldOutState(GumballMachine gumballMachineRevised) {
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
