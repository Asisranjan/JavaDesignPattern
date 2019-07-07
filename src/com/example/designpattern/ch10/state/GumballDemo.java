package com.example.designpattern.ch10.state;

public class GumballDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachineRevised gm =  new GumballMachineRevised(5);
		System.out.println(gm);
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm);
		gm.insertQuarter();
		gm.turnCrank();
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm);
	}

}
