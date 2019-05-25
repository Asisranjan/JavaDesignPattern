package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.CeilingFan;

public class CeilingFanHighCommand implements Command{
	private CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
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
