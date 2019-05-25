package com.example.designpattern.ch06.command.homeautomation;

public class Sterio implements ApplicationControl {

	private String location;
	
	public Sterio() {
		location = "";
	}

	public Sterio(String location) {
		// TODO Auto-generated constructor stub
		this.location = location;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println(location + "Sterio is on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println(location + "Sterio is off");
	}
	
	public void setCd() {
		System.out.println(location + "Sterio with CD");
	}
	
	public void setDvd() {
		System.out.println(location + "Sterio with DVD");
	}
	
	public void setRadio() {
		System.out.println(location + "Sterio with radio");
	}

	public void setVolume(int volume) {
		System.out.println(location + "Sterio with Volume "+volume);
	}
}
