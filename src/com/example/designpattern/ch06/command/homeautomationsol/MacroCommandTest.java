package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.Light;
import com.example.designpattern.ch06.command.homeautomation.Sterio;
import com.example.designpattern.ch06.command.homeautomation.Tv;

public class MacroCommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light = new Light("Party Hall ");
		Sterio sterio = new Sterio("Party Hall ");
		Tv tv = new Tv("Party Hall ");
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		SterioOnWithCDCommand sterioOnWithCDCommand = new SterioOnWithCDCommand(sterio);
		TvOnCommand tvOnCommand = new TvOnCommand(tv);
		
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		SterioOffCommand sterioOffCommand = new SterioOffCommand(sterio);
		TvOffCommand tvOffCommand = new TvOffCommand(tv);
		
		Command[] onCommands = {lightOnCommand, sterioOnWithCDCommand, tvOnCommand};
		Command[] offCommands = {lightOffCommand, sterioOffCommand, tvOffCommand};
		
		MacroCommand macroOnCommand = new MacroCommand(onCommands);
		MacroCommand macroOffCommand = new MacroCommand(offCommands);
		
		RemoteControl rc = new RemoteControl();
		rc.setCommand(0, macroOnCommand, macroOffCommand);
		
		rc.onButtonWasPressed(0);
		
		rc.offButtonWasPressed(0);
		
		System.out.println("=======undo========");
		rc.undoButtonWasPressed();

	}

}
