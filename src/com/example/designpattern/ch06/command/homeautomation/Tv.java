package com.example.designpattern.ch06.command.homeautomation;

public class Tv {
	private String location;
	public Tv(String location) {
		// TODO Auto-generated constructor stub
		this.location = location;
	}

	public void on() {
		System.out.println(location + "Tv On");
	}
	
	public void off() {
		System.out.println(location + "Tv Off");
	}
	
	public void setInputChannel() {
		
	}
	
	public void setVolume() {
		
	}
}
