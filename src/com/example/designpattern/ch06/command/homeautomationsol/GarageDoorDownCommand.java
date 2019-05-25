package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.GarageDoor;

public class GarageDoorDownCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		// TODO Auto-generated constructor stub
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.down();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.up();
	}

}
