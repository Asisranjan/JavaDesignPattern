package com.example.designpattern.ch06.command.homeautomation;

public class GarageDoor {
	private String location;
	
	public GarageDoor() {
		location = "";
	}
	
	public GarageDoor(String location) {
		// TODO Auto-generated constructor stub
		this.location = location;
	}

	public void up() {
		System.out.println(location + "Garage Door open");
	}
	
	public void down() {
		
	}
	
	public void stop() {
		
	}
	
	public void lightOn() {
		
	}
	
	public void lightOff() {
		
	}
}
