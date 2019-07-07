package com.example.designpattern.ch11;

import com.example.designpattern.ch11.gumball.GumballMachine;
import com.example.designpattern.ch11.proxy.GumballMonitor;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gm =  new GumballMachine("Uganda", 112);
		System.out.println(gm);
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm);
		gm.insertQuarter();
		gm.turnCrank();
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm);
		
		GumballMonitor gmon = new GumballMonitor(gm);
		gmon.printReport();
	}

}
