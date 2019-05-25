package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.CeilingFan;

public class CeilingFanRemoteLoaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CeilingFan ceilingFan = new CeilingFan("Living Room ");
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		RemoteControl rc = new RemoteControl();
		rc.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
		rc.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
		
		rc.onButtonWasPressed(0);
		rc.offButtonWasPressed(0);
		
		rc.undoButtonWasPressed();
		
		rc.onButtonWasPressed(1);
		rc.undoButtonWasPressed();
		
	}

}
