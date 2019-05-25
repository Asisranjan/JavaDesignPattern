package com.example.designpattern.ch06.command.homeautomationsol;

public class NoCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("No Command. Do Nothing.");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
