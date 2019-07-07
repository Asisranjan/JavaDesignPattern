package com.example.designpattern.ch11.proxy;

import com.example.designpattern.ch11.gumball.GumballMachine;

public class GumballMonitor {
	GumballMachine gm;
	
	public GumballMonitor(GumballMachine gm) {
		this.gm = gm;
	}
	
	public void printReport() {
		System.out.println("count: "+gm.getCount());
		System.out.println("state: "+gm.getState());
		System.out.println("location: "+gm.getLocation());
	}
}
