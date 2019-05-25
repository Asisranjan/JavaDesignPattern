package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.Sterio;

public class SterioOffCommand implements Command {
	private Sterio sterio;
	
	public SterioOffCommand(Sterio sterio) {
		this.sterio = sterio;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sterio.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		sterio.on();
		sterio.setCd();
		sterio.setVolume(11);
	}

}
