package com.example.designpattern.ch10.state;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gm = new GumballMachine(5);
		System.out.println(gm);
		
		System.out.println("================");
		gm.insertQuarter();
		gm.turnsCrank();
		System.out.println(gm);
		
		System.out.println("================");
		gm.insertQuarter();
		gm.ejectQuarter();
		gm.turnsCrank();
		
		System.out.println(gm);
		System.out.println("================");
		
		gm.insertQuarter();
		gm.turnsCrank();
		gm.insertQuarter();
		gm.turnsCrank();
		gm.ejectQuarter();
		
		System.out.println(gm);
		System.out.println("================");
		
		
		gm.insertQuarter();
		gm.insertQuarter();
		gm.turnsCrank();
		gm.insertQuarter();
		gm.turnsCrank();
		gm.insertQuarter();
		gm.turnsCrank();
		
		System.out.println(gm);
	}

}
