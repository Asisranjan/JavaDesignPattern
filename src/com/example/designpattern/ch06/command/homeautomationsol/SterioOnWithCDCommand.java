package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.Sterio;

public class SterioOnWithCDCommand implements Command {
	Sterio sterio;
	
	public SterioOnWithCDCommand(Sterio sterio) {
		// TODO Auto-generated constructor stub
		this.sterio = sterio;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sterio.on();
		sterio.setCd();
		sterio.setVolume(11);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		sterio.off();
	}
}
