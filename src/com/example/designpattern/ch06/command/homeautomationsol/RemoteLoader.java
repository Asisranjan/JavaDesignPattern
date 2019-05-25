package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.CeilingFan;
import com.example.designpattern.ch06.command.homeautomation.GarageDoor;
import com.example.designpattern.ch06.command.homeautomation.Light;
import com.example.designpattern.ch06.command.homeautomation.Sterio;

public class RemoteLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new RemoteControl();
		Light livingRoomLight = new Light("Living Room ");
		Light kitchenRoomLight = new Light("Kitchen Room ");
		CeilingFan ceilingFan = new CeilingFan("Living Room ");
		GarageDoor garageDoor = new GarageDoor("");
		Sterio sterio = new Sterio("Living Room ");
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenRoomLight);
		
		CeilingFanHighCommand ceilingFanOnCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
		
		SterioOnWithCDCommand sterioOnWithCDCommand = new SterioOnWithCDCommand(sterio);
		SterioOffCommand sterioOffCommand = new SterioOffCommand(sterio);
		
		rc.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		rc.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		rc.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
		rc.setCommand(3, garageDoorOpenCommand, garageDoorDownCommand);
		rc.setCommand(4, sterioOnWithCDCommand, sterioOffCommand);
		
		System.out.println(rc);
		
		rc.onButtonWasPressed(0);
		rc.offButtonWasPressed(0);
		rc.onButtonWasPressed(1);
		rc.offButtonWasPressed(1);
		rc.onButtonWasPressed(2);
		rc.undoButtonWasPressed();
		rc.undoButtonWasPressed();
		rc.offButtonWasPressed(2);
		rc.onButtonWasPressed(3);
		rc.offButtonWasPressed(3);
		rc.onButtonWasPressed(4);
		rc.offButtonWasPressed(4);
		rc.onButtonWasPressed(5);
		rc.offButtonWasPressed(5);
		rc.onButtonWasPressed(6);
		rc.offButtonWasPressed(6);
		
		
		
	}

}
