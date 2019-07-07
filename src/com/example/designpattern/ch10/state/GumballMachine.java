package com.example.designpattern.ch10.state;

public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	int state = SOLD;
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You cannot insert another quarter");
		}
		else if (state == SOLD) {
			System.out.println("Please wait, we are already giving a gumball");
		}
		else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the gumball is sold out");
		}
		else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted quarter");
		}
	}
	
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			state = NO_QUARTER;
			System.out.println("You ejected quarter");
		}
		else if (state == SOLD) {
			System.out.println("Sorry, you already turned crank");
		}
		else if (state == SOLD_OUT) {
			System.out.println("You can't eject a quarter as you have not inserted a quarter yet");
		}
		else if (state == NO_QUARTER) {
			System.out.println("You have not inserted quarter");
		}
	}
	
	public void turnsCrank() {
		if (state == HAS_QUARTER) {
			state = SOLD;
			System.out.println("You turned crank");
			dispense();
		}
		else if (state == SOLD) {
			System.out.println("Turning crank twice can't help anyway");
		}
		else if (state == SOLD_OUT) {
			System.out.println("You can't turn crank when sold out");
		}
		else if (state == NO_QUARTER) {
			System.out.println("You can't turn crank when there is no quarter");
		}
	}
	
	public void dispense() {
		if (state == HAS_QUARTER) {
			System.out.println("You cannot dispense. need to sold");
		}
		else if (state == SOLD) {
			System.out.println("A gumball comes rolling out the slot");
			count = count - 1;
			if (count == 0) {
				System.out.println("Oops!No gumballs");
				state = SOLD_OUT;
			}
			else {
				state = NO_QUARTER;
			}
		}
		else if (state == SOLD_OUT) {
			System.out.println("No quarter dispensed");
		}
		else if (state == NO_QUARTER) {
			System.out.println("You need to insert quarter first");
		}
	}

	@Override
	public String toString() {
		String stateInString = (state == 0 ? "SOLD_OUT" : state == 1 ? "NO_QUARTER" : state == 2 ? "HAS_QUARTER" : "SOLD");
		return "GumballMachine [state=" + stateInString + "]";
	}
	
	
}
