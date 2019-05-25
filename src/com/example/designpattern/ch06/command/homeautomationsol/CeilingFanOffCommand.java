package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.CeilingFan;

public class CeilingFanOffCommand implements Command {
	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		}
		if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		}
		if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		}
		if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
