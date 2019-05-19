package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.GarageDoor;
import com.example.designpattern.ch06.command.homeautomation.Light;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		remoteControl.setCommand(lightOnCommand);
		remoteControl.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		remoteControl.setCommand(garageDoorOpenCommand);
		remoteControl.buttonWasPressed();
	}

}
