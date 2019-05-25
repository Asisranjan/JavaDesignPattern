package com.example.designpattern.ch06.command.homeautomation;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private String location;
	int speed;
	
	public CeilingFan() {
		location = "";
		speed=OFF;
	}
	
	public CeilingFan(String location) {
		this.location = location;
		speed=OFF;
	}
	
	public void high() {
		System.out.println("ceiling fan high");
		speed = HIGH;
	}
	
	public void medium() {
		System.out.println("ceiling fan med");
		speed = MEDIUM;
	}
	
	public void low() {
		System.out.println("ceiling fan low");
		speed = LOW;
	}
	
	public void off() {
		System.out.println("ceiling fan off");
		speed = OFF;
	}
	
	public int getSpeed() {
		return speed;
	}
}
