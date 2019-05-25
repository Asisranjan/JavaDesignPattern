package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.Light;

public class LightOffCommand implements Command {

	Light light;
	
	public LightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
