package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.CeilingFan;

public class CeilingFanLowCommand implements Command {
	private int prevSpeed;
	private CeilingFan ceilingFan;
	
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
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
