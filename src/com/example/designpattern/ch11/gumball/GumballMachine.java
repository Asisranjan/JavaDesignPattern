package com.example.designpattern.ch11.gumball;

public class GumballMachine implements GumballService {	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldState;
	int count = 0;
	
	String location;
	
	public GumballMachine(String location, int count) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = count;
		
		if (count > 0) {
			state = noQuarterState;
		}
		
		this.location = location;
	}

	public void setState(State state) {
		// TODO Auto-generated method stub
		this.state = state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out of the slot..");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public void refill(int noOfBalls) {
		count = count + noOfBalls;
		
		if (count > 0) {
			state = noQuarterState;
		}
	}
	
	public String getLocation() {
		return location;
	}

	public State getState() {
		// TODO Auto-generated method stub
		return state;
	}
}
